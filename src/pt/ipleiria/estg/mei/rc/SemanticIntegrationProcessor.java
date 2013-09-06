/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.mei.rc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.SwingWorker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.w3c.dom.Node;
import pt.ipleiria.estg.mei.rc.antlr.SemanticIntegrationLexer;
import pt.ipleiria.estg.mei.rc.antlr.SemanticIntegrationParser;
import pt.ipleiria.estg.mei.rc.xml.XMLMatchException;
import pt.ipleiria.estg.mei.rc.xml.XMLUtils;

/**
 *
 * @author cesperanc
 */
public class SemanticIntegrationProcessor extends SwingWorker<String, String> {

    private java.io.File file = null;
    private String text = null;
    private Informable informable = null;
    
    private static final float WEIGHT_ATTRIBUTES = new Float(0.2);
    private static final float WEIGHT_CHILDS = new Float(0.8);

    public SemanticIntegrationProcessor(java.io.File file, Informable informable) {
        this.file = file;
        this.informable = informable;
    }

    public SemanticIntegrationProcessor(String text, Informable informable) {
        this.text = text;
        this.informable = informable;
    }

    /**
     * Load the data from the file
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private String loadDataFromFile() throws FileNotFoundException, IOException {
        FileInputStream fis;
        BufferedReader br;
        fis = new FileInputStream(this.file);
        br = new BufferedReader(new InputStreamReader(fis));
        String read;
        StringBuilder t = new StringBuilder();
        while ((read = br.readLine()) != null) {
            t.append(read).append("\n");
        }
        return t.toString();
    }

    /**
     * Remove the accents from a string
     *
     * @param str
     * @return
     *
     * @author Rodrigue
     * @see http://stackoverflow.com/a/1215117
     */
    private String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    /**
     * Normalize the text
     *
     * @param str
     * @return
     */
    private String normalizeText(String str) {
        // All the characters must be lower cased
        str = str.toLowerCase();

        // We want the à
        str = str.replace("#", "");
        str = str.replace("à", "#");

        // Remove accents
        str = this.deAccent(str);

        // Put the à back in
        str = str.replace("#", "à");

        // Add a space to all the c/
        str = str.replace("c/", "c/ ");

        // Remove all duplicated white spaces from the data @see: http://stackoverflow.com/a/15495127
        str = str
                // 1. remove all empty lines
                .replaceAll("(?m)^[ \t]*\r?\n", "")
                // 2. compress all non-newline whitespaces to single space
                .replaceAll("[\\s&&[^\\n]]+", " ")
                // 3. remove spaces from begining or end of lines
                .replaceAll("(?m)^\\s|\\s$", "")
                // 4. compress multiple newlines to single newlines
                .replaceAll("\\n+", "\n")
                // 5. remove newlines from begining or end of string
                .replaceAll("^\n|\n$", "");

        // Remove all the duplicates
        str = stripDuplicates(str);
        
        // We don't want to break the XML
        str = str.replace("&", " and ");
        str = str.replace("\"", "'");
        // Escape string for XML
        //str = StringEscapeUtils.escapeXml(str);

        return str;
    }

    /**
     *
     * @param str
     * @return
     * @see http://stackoverflow.com/a/5931689
     */
    public String stripDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        java.util.Set<String> uniqueLines = new LinkedHashSet<>();

        String[] chunks = str.split("\n");
        uniqueLines.addAll(java.util.Arrays.asList(chunks));

        for (String chunk : uniqueLines) {
            result.append(chunk).append("\n");
        }

        return result.toString();
    }

    @Override
    protected String doInBackground() throws Exception {
        String data = "";

        setProgress(0);

        if (this.file != null) {
            // Load data from file
            publish("Loading data from " + this.file + " file...");
            try {
                data = this.loadDataFromFile();
            } catch (IOException e1) {
                publish("Error loading data from file " + this.file + ". (" + e1.getLocalizedMessage() + ")");
                return "";
            }
            publish("Data loaded.");
            setProgress(10);
        } else if (this.text != null) {
            data = this.text;
        } else {
            publish("No data provided.");
            return data;
        }

        // Cleanup data
        publish("Cleanup data...");
        data = this.normalizeText(data);
        publish("Data cleanup completed.");
        setProgress(30);

        // Extract properties with antlr
        publish("Extracting direct properties with antlr...");
        try {
            data = this.parseLines(data.split("\n"));
        } catch (Exception e1) {
            publish("Error while extrating properties. (" + e1.getLocalizedMessage() + ")");
        }
        publish("Direct property extraction completed.");
        setProgress(75);
        
        //@TODO: infer new properties with ontologies
        
        
        
        // Prettify XML
        publish("Prettyfing results...");
        try {
            data = XMLUtils.prettyFormat(data);
            publish("Direct property extraction completed.");
        } catch (Exception e1) {
            publish("Error while formating the XML. (" + e1.getLocalizedMessage() + ")");
            System.out.println("Error while formating the XML. (" + e1.getLocalizedMessage() + ")");
        }
        setProgress(99);


        return data;
    }

    @Override
    protected void process(List<String> chunks) {
        for (String message : chunks) {
            informable.messageChanged(message);
        }
    }

    /**
     * Parse each line with antlr library an return the result as a XML string
     * @param lines
     * @return 
     */
    private String parseLines(String lines[]) {
        String result = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n<produtos>\n";
        for (int a = 0; a < lines.length; a++) {
            result += this.parseLine(lines[a]);
        }
        result += "</produtos>";
        return result;
    }

    /**
     * Parse the line with antlr library to extract properties
     * @param expression
     * @return 
     */
    private String parseLine(String expression) {
        try {
            SemanticIntegrationLexer lexer = new SemanticIntegrationLexer(new ANTLRInputStream(expression));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SemanticIntegrationParser parser = new SemanticIntegrationParser(tokens);
            return parser.descricao().value;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
    
    public static float evaluateXmlNodeSimilarity(Node expected, Node actual) {
        try {
            XMLUtils.compareNodes(expected, actual);
        } catch (XMLMatchException ex) {
            switch(ex.getType()){
                case XMLMatchException.OTHER_DIFERENCES:
                    if(ex.getNumberOfEqualAttributes()==ex.getNumberOfTotalAttributes() && ex.getNumberOfEqualChilds()==ex.getNumberOfTotalChilds()){
                        // The nodes match 100%
                        return 100;
                    }else{
                        float total = 0, weightAttributes, weightChilds;
                        if(ex.getNumberOfTotalAttributes()>0 && ex.getNumberOfTotalChilds()>0){
                            weightAttributes = WEIGHT_ATTRIBUTES;
                            weightChilds = WEIGHT_CHILDS;
                        }else if(ex.getNumberOfTotalChilds()>0){
                            weightAttributes = 0;
                            weightChilds = 1;
                        }else if(ex.getNumberOfTotalAttributes()>0){
                            weightAttributes = 1;
                            weightChilds = 0;
                        }else{
                            weightAttributes = 0;
                            weightChilds = 0;
                        }
                        total+=weightAttributes*(ex.getNumberOfEqualAttributes()*100/ex.getNumberOfTotalAttributes())+weightChilds*(ex.getNumberOfEqualChilds()*100/ex.getNumberOfTotalChilds());
                        return total;
                    }
            }
        }
        return 0;
    }
}
