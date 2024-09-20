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
public class Frame2_3 extends JFrame implements ActionListener,ItemListener{

    private String JenisKendaraan;
    JLabel lnama = new JLabel("Nama Penyewa :");
    JLabel lnomor = new JLabel("Momor Telp :");
    JLabel ldaftar = new JLabel("Daftar Kendaraan :");
    JLabel lhari = new JLabel("Lama Sewa :");
    JLabel lharga1 = new JLabel("Harga : ");
    JLabel lharga2;
    
   
    JTextField fnama = new JTextField(20);
    JTextField fnomor = new JTextField(20);
    JTextField fhari = new JTextField(10);
    
    
    String jmotor [] = {"Motor A", "Motor B", "Motor C"};
    String jmobil [] = {"Mobil A", "Mobil B", "Mobil C"};
    JComboBox cmbDaftar;
    
    JButton simpan = new JButton  ("Simpan");
    
    
    public Frame2_3(String jenisKendaraan) {
        this.JenisKendaraan = jenisKendaraan;
        setTitle("Penyewaan " + jenisKendaraan);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,250);
        if(JenisKendaraan == "Motor"){
            cmbDaftar =  new JComboBox(jmotor);
            lharga2 = new JLabel("10.000.000");
        }else {
            cmbDaftar =  new JComboBox(jmobil);
            lharga2 = new JLabel("100.000.000");

        }
        cmbDaftar.addItemListener(this);
        simpan.addItemListener(this);
        setLayout(null);
        setLocationRelativeTo(null);
        add(cmbDaftar);
        add(lnama);
        add(lnomor);
        add(ldaftar);
        add(lhari);
        add(fnama);
        add(fhari);
        add(fnomor);
        add(simpan);
        add(lharga1);
        add(lharga2);
        
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130,10,150,20);
        lnomor.setBounds(10, 35, 120, 20);
        fnomor.setBounds(130,35,150,20);
        ldaftar.setBounds(10,60,150,20);
        cmbDaftar.setBounds(130,60,150,20);
        lharga1.setBounds(10,85,150,20);
        lharga2.setBounds(130,85,150,20);
        lhari.setBounds(10, 115, 120, 20);
        fhari.setBounds(130,115,150,20);
        simpan.setBounds(10,155,120, 20);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nama = fnama.getText();
        String nomor = fnomor.getText();
        int hari = Integer.parseInt(fhari.getText());
        int harga = Integer.parseInt(lharga2.getText());
        int total = hari*harga;
        
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        if(event.getStateChange() == ItemEvent.SELECTED){
        if(JenisKendaraan == "Motor"){
            if(cmbDaftar.getSelectedIndex() == 0)
                lharga2.setText("10.000.000");
            else if(cmbDaftar.getSelectedIndex() == 1)
                lharga2.setText("17.000.000");
            else if(cmbDaftar.getSelectedIndex() == 2)
                lharga2.setText("20.000.000");
        }else {
            if(cmbDaftar.getSelectedIndex() == 0)
                lharga2.setText("100.000.000");
            else if(cmbDaftar.getSelectedIndex() == 1)
                lharga2.setText("170.000.000");
            else if(cmbDaftar.getSelectedIndex() == 2)
                lharga2.setText("70.000.000");
        }
        }
    }
    
}
