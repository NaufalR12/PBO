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
public class modeltabeldataparkir extends AbstractTableModel {
    
    List<dataparkir> dp;
    public modeltabeldataparkir(List<dataparkir>dp) {
        this.dp = dp;
    }
    
    
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Nama";
            case 1:
                return "Jenis";
            case 2:
                return "Plat";
            case 3:
                return "Merk";
            case 4:
                return "Durasi";
            case 5:
                return "Total";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dp.get(row).getNama();
            case 1:
                return dp.get(row).getJenis();
            case 2:
                return dp.get(row).getPlat();
            case 3:
                return dp.get(row).getMerk();
            case 4:
                return dp.get(row).getDurasi();
            case 5:
                return dp.get(row).getTotal();
            default:
                return null;
        }
    }
    
}
