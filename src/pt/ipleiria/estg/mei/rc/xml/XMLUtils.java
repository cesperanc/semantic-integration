package pt.ipleiria.estg.mei.rc.xml;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import pt.ipleiria.estg.mei.rc.SemanticIntegrationProcessor;
import static pt.ipleiria.estg.mei.rc.xml.DOMUtils.compareNodes;

/**
 *
 * @author cesperanc
 */
public class XMLUtils extends DOMUtils {

    /**
     * Prettify the XML string
     *
     * @param input with the XML contents to format
     * @return String with the format content
     */
    public static String prettyFormat(String input) {
        return prettyFormat(input, 4);
    }

    /**
     * Prettify the XML string
     *
     * @param input with the XML contents to format
     * @param indent with the number of indentation spaces
     * @return String with the format content
     */
    public static String prettyFormat(String input, int indent) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (TransformerFactoryConfigurationError | IllegalArgumentException | TransformerException e) {
            throw new RuntimeException(e); // simple exception handling, please review it
        }
    }

    public static String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", 4);
            Transformer t = transformerFactory.newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }

    public static void compareNodes(Node expected, Node actual) throws XMLMatchException {
        compareNodes(expected, actual, true);
    }

    public static void compareNodes(Node expected, Node actual, boolean subtree) throws XMLMatchException {
        if (expected.getNodeType() != actual.getNodeType()) {
            throw new XMLMatchException(XMLMatchException.DIFERENT_NODE_TYPE, String.format("Different types of nodes: %s %s", expected, actual));
        }
        if (expected instanceof Document) {
            Document expectedDoc = (Document) expected;
            Document actualDoc = (Document) actual;
            compareNodes(expectedDoc.getDocumentElement(), actualDoc.getDocumentElement());
        } else if (expected instanceof Element) {
            Element expectedElement = (Element) expected;
            Element actualElement = (Element) actual;

            // compare element names
            if (!expectedElement.getTagName().equals(actualElement.getTagName())) {
                throw new XMLMatchException(XMLMatchException.DIFERENT_NODE_NAME, String.format("Element names do not match: %s %s", expectedElement.getTagName(), actualElement.getTagName()));
            }
            // compare element ns
            String expectedNS = expectedElement.getNamespaceURI();
            String actualNS = actualElement.getNamespaceURI();
            if ((expectedNS == null && actualNS != null)
                    || (expectedNS != null && !expectedNS.equals(actualNS))) {
                throw new XMLMatchException(XMLMatchException.DIFERENT_NODE_NAMESPACE, String.format("Element namespaces names do not match: %s %s", expectedNS, actualNS));
            }

            // compare attributes
            NamedNodeMap expectedAttrs = expectedElement.getAttributes();
            NamedNodeMap actualAttrs = actualElement.getAttributes();

            int numberOfEqualAttributes = 0;
            int numberOfTotalAttributes = 0;

            for (int i = 0; i < expectedAttrs.getLength(); i++) {
                Attr expectedAttr = (Attr) expectedAttrs.item(i);
                if (expectedAttr.getName().startsWith("xmlns")) {
                    continue;
                }
                boolean found = false;
                for (int in = 0; in < actualAttrs.getLength(); in++) {
                    Attr actualAttr = (Attr) actualAttrs.item(in);
                    if (actualAttr.getName().startsWith("xmlns")) {
                        continue;
                    }
                    if (expectedAttr.getName().equals(actualAttr.getName())) {
                        if (expectedAttr.getValue().equals(actualAttr.getValue())) {
                            numberOfEqualAttributes++;
                        }
                    }
                }
                numberOfTotalAttributes++;
            }
            int numberOfEqualChilds = 0;
            int numberOfTotalChilds = 0;
            if (subtree) {
                // compare children
                NodeList expectedChildren = expectedElement.getChildNodes();
                NodeList actualChildren = actualElement.getChildNodes();

                numberOfTotalChilds = 0;

                for (int i = 0; i < expectedChildren.getLength(); i++) {
                    Node expectedChild = expectedChildren.item(i);
                    if (expectedChild.getNodeType() != org.w3c.dom.Node.ELEMENT_NODE) {
                        continue;
                    }

                    for (int in = 0; in < actualChildren.getLength(); in++) {
                        Node actualChild = actualChildren.item(in);

                        if (actualChild.getNodeType() != org.w3c.dom.Node.ELEMENT_NODE) {
                            continue;
                        }
                        /*
                         if (expectedChild.isEqualNode(actualChild)){
                         numberOfEqualChilds++;
                         break;
                         }*/
                        if (expectedChild.getNodeName().equals(actualChild.getNodeName())) {
                            try {
                                compareNodes(expectedChild, actualChild, true);
                            } catch (XMLMatchException e) {
                                switch (e.getType()) {
                                    case XMLMatchException.OTHER_DIFERENCES:
                                        if (e.getNumberOfEqualChilds() == e.getNumberOfTotalChilds()) {
                                            numberOfEqualChilds++;
                                            break;
                                        }
                                }
                            }
                        }
                    }

                    numberOfTotalChilds++;
                }
            }
            throw new XMLMatchException(numberOfEqualAttributes, numberOfTotalAttributes, numberOfEqualChilds, numberOfTotalChilds);
        } else if (expected instanceof Text) {
            String expectedData = ((Text) expected).getData().trim();
            String actualData = ((Text) actual).getData().trim();

            if (!expectedData.equals(actualData)) {
                throw new XMLMatchException(XMLMatchException.DIFERENT_TEXT, "Text does not match: " + expectedData + " " + actualData);
            }
        }
    }

    /**
     * Based on a XML string generate a list of XML nodes
     *
     * @param data
     * @return
     */
    public static List<Node> getChildNodes(String data) {
        if (data != null && !data.isEmpty()) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                InputSource is = new InputSource(new StringReader(data));
                Document document = builder.parse(is);

                document.getDocumentElement().normalize();

                NodeList nodeList = document.getDocumentElement().getChildNodes();
                if (nodeList != null) {
                    //Search all resources 
                    int s = nodeList.getLength();
                    ArrayList<Node> resultNodeList = new ArrayList<>();

                    for (int i = 0; i < s; i++) {
                        //Element elem = (Element) descriptionList.item(i);
                        if (nodeList.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                            resultNodeList.add(nodeList.item(i));
                        }
                    }
                    return resultNodeList;
                }
            } catch (ParserConfigurationException | SAXException | IOException ex) {
                Logger.getLogger(SemanticIntegrationProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    /**
     * Get a list of string elements direct descends from the root node from an
     * XML string
     *
     * @param data
     * @return
     */
    public static List<String> getRootElements(String data) {
        ArrayList<Node> descriptionList = (ArrayList<Node>) getChildNodes(data);
        if (descriptionList != null) {
            //Search all resources 
            int s = descriptionList.size();
            ArrayList<String> descriptions = new ArrayList<>();

            for (int i = 0; i < s; i++) {
                //Element elem = (Element) descriptionList.item(i);
                if (descriptionList.get(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    if (descriptionList.get(i).getAttributes() != null) {
                        descriptions.add(new StringBuilder().append(descriptionList.get(i).getNodeName()).append("_").append(descriptionList.get(i).getAttributes().item(0)).toString());
                    }
                }
            }
            return descriptions;
        }
        return null;
    }

    /**
     * Get a specific node by index based on the XML generated from a XML string
     *
     * @param data
     * @return
     */
    public static Node getElementAtIndex(String data, int index) {
        ArrayList<Node> nodeList = (ArrayList<Node>) getChildNodes(data);
        if (nodeList != null) {
            //Search all resources 
            int s = nodeList.size();
            int currentIndex = -1;
            for (int i = 0; i < s; i++) {
                //Element elem = (Element) descriptionList.item(i);
                if (nodeList.get(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    if (currentIndex == index) {
                        return nodeList.get(i);
                    }
                    currentIndex++;
                }
            }
        }
        return null;
    }
}
