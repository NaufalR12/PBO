/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LENOVO
 */
public class modeltabeldatahp extends AbstractTableModel{
    
    List<datahp> dp;
    public modeltabeldatahp(List<datahp>dp) {
        this.dp = dp;
        
    }
    
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "MERK";
            case 2: 
                return "BRAND";
            case 3:
                return "CHIP";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dp.get(row).getId();
            case 1:
                return dp.get(row).getMerk();
            case 2: 
                return dp.get(row).getBrand();
            case 3:
                return dp.get(row).getChip();
            default:
                return null;
        }
    }
    
}
