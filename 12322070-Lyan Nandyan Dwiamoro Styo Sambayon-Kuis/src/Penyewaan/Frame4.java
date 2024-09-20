/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penyewaan;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
/**
 *
 * @author Lab Informatika
 */
public class Frame4 extends JFrame implements ActionListener{
    

    public Frame4(String nama, String nomor, int hari, int harga, int total) {
        JLabel lnama = new JLabel("Nama Penyewa : "+nama);
        JLabel lnomor = new JLabel("Momor Telp : "+nomor);
        JLabel ldaftar = new JLabel("Daftar Kendaraan : ");
        JLabel lhari = new JLabel("Lama Sewa : "+harga);
        JLabel lharga = new JLabel("Lama Sewa : "+total);;
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
