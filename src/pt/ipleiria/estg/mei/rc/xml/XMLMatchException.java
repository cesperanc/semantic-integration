/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.mei.rc.xml;

/**
 *
 * @author cesperanc
 */
public class XMLMatchException extends Exception{
    public static final int DIFERENT_NODE_TYPE = -1;
    public static final int DIFERENT_NODE_NAME = -2;
    public static final int DIFERENT_NODE_NAMESPACE = -3;
    public static final int OTHER_DIFERENCES = -4;
    public static final int DIFERENT_TEXT = -5;
    
    private int type=OTHER_DIFERENCES;
    private int numberOfEqualAttributes=0;
    private int numberOfTotalAttributes=0;
    private int numberOfEqualChilds=0;
    private int numberOfTotalChilds=0;
    
    public XMLMatchException(int type, String message){
        super(message);
        this.type = type;
    }
    
    public XMLMatchException(String message, int numberOfEqualAttributes, int numberOfTotalAttributes, int numberOfEqualChilds, int numberOfTotalChilds){
        super(message);
        this.type = OTHER_DIFERENCES;
        this.numberOfEqualAttributes = numberOfEqualAttributes;
        this.numberOfEqualChilds = numberOfEqualChilds;
        this.numberOfTotalAttributes = numberOfTotalAttributes;
        this.numberOfTotalChilds = numberOfTotalChilds;
    }
    
    public XMLMatchException(int numberOfEqualAttributes, int numberOfTotalAttributes, int numberOfDiferentChilds, int numberOfTotalChilds){
        this("", numberOfEqualAttributes, numberOfTotalAttributes, numberOfDiferentChilds, numberOfTotalChilds);
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the numberOfEqualAttributes
     */
    public int getNumberOfEqualAttributes() {
        return numberOfEqualAttributes;
    }

    /**
     * @param numberOfEqualAttributes the numberOfEqualAttributes to set
     */
    public void setNumberOfEqualAttributes(int numberOfEqualAttributes) {
        this.numberOfEqualAttributes = numberOfEqualAttributes;
    }

    /**
     * @return the numberOfEqualChilds
     */
    public int getNumberOfEqualChilds() {
        return numberOfEqualChilds;
    }

    /**
     * @param numberOfEqualChilds the numberOfEqualChilds to set
     */
    public void setNumberOfEqualChilds(int numberOfEqualChilds) {
        this.numberOfEqualChilds = numberOfEqualChilds;
    }

    /**
     * @return the numberOfTotalAttributes
     */
    public int getNumberOfTotalAttributes() {
        return numberOfTotalAttributes;
    }

    /**
     * @param numberOfTotalAttributes the numberOfTotalAttributes to set
     */
    public void setNumberOfTotalAttributes(int numberOfTotalAttributes) {
        this.numberOfTotalAttributes = numberOfTotalAttributes;
    }

    /**
     * @return the numberOfTotalChilds
     */
    public int getNumberOfTotalChilds() {
        return numberOfTotalChilds;
    }
}
