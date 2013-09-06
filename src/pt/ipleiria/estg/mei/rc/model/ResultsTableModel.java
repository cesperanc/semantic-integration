/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.mei.rc.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.w3c.dom.Node;

/**
 *
 * @author cesperanc
 */
public class ResultsTableModel extends AbstractTableModel {

    private String[] columnNames = {"Node ID",
        "Node value",
        "% similiarity"};
    
    private List<ResultRow> data = new ArrayList<>();
    
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false
    };

    @Override
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return data.get(row).getIndex();
            case 2:
                return data.get(row).getMatch();
        }
        return data.get(row).getName();
    }
    
    public Node getNodeAt(int row) {
        return data.get(row).getNode();
    }
    
    public void insertRow(int index, String name, float match, Node node){
        this.data.add(new ResultRow(index, name, match, node));
        fireTableDataChanged();
    }
    
    public void clear(){
        this.data.clear();
        fireTableDataChanged();
    }
}

class ResultRow{
    private Node node;
    private int index;
    private String name;
    private float match;

    public ResultRow(int index, String name, float match, Node node){
        super();
        this.node = node;
        this.index = index;
        this.name = name;
        this.match = match;
    }
    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the match
     */
    public float getMatch() {
        return match;
    }

    /**
     * @param match the match to set
     */
    public void setMatch(float match) {
        this.match = match;
    }

    /**
     * @return the node
     */
    public Node getNode() {
        return node;
    }

    /**
     * @param node the node to set
     */
    public void setNode(Node node) {
        this.node = node;
    }
    
}