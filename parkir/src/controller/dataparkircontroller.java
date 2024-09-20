/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOdataparkir.dataparkirDAO;
import DAOImplement.dataparkirimplement;
import javax.swing.JOptionPane;
import model.*;
import view.MainView;
/**
 *
 * @author LENOVO
 */
public class dataparkircontroller {
    MainView frame;
    dataparkirimplement impldataparkir;
    List<dataparkir> dp;
    
    public dataparkircontroller(MainView frame) {
        this.frame = frame;
        impldataparkir = new dataparkirDAO();
        dp = impldataparkir.getAll();
    }
    
    public void isitabel(){
        dp = impldataparkir.getAll();
        modeltabeldataparkir pp = new modeltabeldataparkir(dp);
        frame.getTabelDataparkir().setModel(pp);
        int count = impldataparkir.count();
    frame.getJTxtjumlah().setText(Integer.toString(count));

    }
    
    public void insert(){
    try {
        dataparkir dp = new dataparkir();
        dp.setNama(frame.getJTxtnama().getText());
        dp.setJenis(frame.getJTxtjenis().getText());
        dp.setPlat(frame.getJTxtplat().getText());
        dp.setMerk(frame.getJTxtmerk().getText());
        dp.setDurasi(Integer.parseInt(frame.getJTxtdurasi().getText()));
        impldataparkir.insert(dp);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Input tidak valid. Harap masukkan nilai yang sesuai, jangan dikosongkan!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

public void update(){
    try {
        dataparkir dp = new dataparkir();
        dp.setNama(frame.getJTxtnama().getText());
        dp.setJenis(frame.getJTxtjenis().getText());
        dp.setPlat(frame.getJTxtplat().getText());
        dp.setMerk(frame.getJTxtmerk().getText());
        dp.setDurasi(Integer.parseInt(frame.getJTxtdurasi().getText()));
        impldataparkir.update(dp);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Input tidak valid. Harap masukkan nilai yang sesuai, jangan dikosongkan!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void delete(){
        try {
        String plat = frame.getJTxtplat().getText();
            if(plat.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                impldataparkir.delete(plat);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void reset() {
        frame.getJTxtnama().setText(""); 
        frame.getJTxtjenis().setText(""); 
        frame.getJTxtplat().setText(""); 
        frame.getJTxtmerk().setText(""); 
        frame.getJTxtdurasi().setText("");
        frame.getJTxttotal().setText("");
    }
    
   

    
}
