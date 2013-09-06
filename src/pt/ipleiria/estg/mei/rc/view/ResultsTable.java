/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.mei.rc.view;

import pt.ipleiria.estg.mei.rc.model.ResultsTableModel;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import org.w3c.dom.Node;
import pt.ipleiria.estg.mei.rc.xml.XMLUtils;

/**
 * Table to show the results
 * @author cesperanc
 */
public class ResultsTable extends JTable {
    protected String[] columnToolTips = {
        "XML node ID",
        "Node content",
        "Match percentage"};

    public ResultsTable() {
        super(new ResultsTableModel());
    }
    //Implement table cell tool tips.

    @Override
    public String getToolTipText(MouseEvent e) {
        String tip = null;
        java.awt.Point p = e.getPoint();
        int rowIndex = rowAtPoint(p);
        int colIndex = columnAtPoint(p);
        int realColumnIndex = convertColumnIndexToModel(colIndex);

        if (realColumnIndex == 1) {
            ResultsTableModel model = (ResultsTableModel) getModel();
            Node node = model.getNodeAt(rowIndex);
            tip = "<html><pre>"+XMLUtils.nodeToString(node).toString().replace("<", "&lt;").replace(">", "&gt;")+"</pre></html>";
        } else {
            tip = super.getToolTipText(e);
        }
        return tip;
    }

    //Implement table header tool tips. 
    @Override
    protected JTableHeader createDefaultTableHeader() {
        return new JTableHeader(columnModel) {
            @Override
            public String getToolTipText(MouseEvent e) {
                String tip = null;
                java.awt.Point p = e.getPoint();
                int index = columnModel.getColumnIndexAtX(p.x);
                int realIndex = columnModel.getColumn(index).getModelIndex();
                return columnToolTips[realIndex];
            }
        };
    }
}