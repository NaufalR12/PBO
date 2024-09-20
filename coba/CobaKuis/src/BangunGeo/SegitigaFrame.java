/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunGeo;

/**
 *
 * @author HP
 */
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rafli
 */
public class SegitigaFrame extends JFrame implements ActionListener {

  JPanel panel;
  JLabel labelInput, labelAlas, labelTinggi, labelHasil;
  JTextField inputAlas, inputTinggi;
  JButton btnKembali, btnHasil;

  public SegitigaFrame() {
    panel = new JPanel();
    labelInput = new JLabel("Masukkan ALas & Tinggi");
    labelAlas = new JLabel("Alas");
    labelTinggi = new JLabel("Tinggi");
    labelHasil = new JLabel();
    
    inputAlas = new JTextField();
    inputTinggi = new JTextField();
    btnHasil = new JButton("Hasil");
    btnKembali = new JButton("Kembali");
    
    add(panel);
    labelInput.setHorizontalAlignment(SwingConstants.CENTER);
    labelAlas.setHorizontalAlignment(SwingConstants.CENTER);
    labelTinggi.setHorizontalAlignment(SwingConstants.CENTER);
    labelHasil.setHorizontalAlignment(SwingConstants.CENTER);
    inputAlas.setHorizontalAlignment(SwingConstants.CENTER);
    inputTinggi.setHorizontalAlignment(SwingConstants.CENTER);
    
    labelInput.setBounds(0, 10, 300, 20);
    
    labelAlas.setBounds(10, 35, 90, 20);
    inputAlas.setBounds(100, 35, 120, 30);
    
    labelTinggi.setBounds(1, 70, 90, 20);
    inputTinggi.setBounds(100, 70, 120, 30);
    
    labelHasil.setBounds(0, 110, 300, 20);
    btnKembali.setBounds(60, 210, 80, 35);
    btnHasil.setBounds(150, 210, 80, 35);
    
    panel.setLayout(null);
    panel.add(labelInput);
    panel.add(labelAlas);
    panel.add(labelTinggi);
    panel.add(labelHasil);
    panel.add(inputAlas);
    panel.add(inputTinggi);
    panel.add(btnKembali);
    panel.add(btnHasil);
    
    setSize(300,300);
    setDefaultCloseOperation(3);
    setLocationRelativeTo(null);
    setVisible(true);
    
    btnHasil.addActionListener(this);
    btnKembali.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnHasil) {
      double alas = Double.parseDouble(inputAlas.getText());
      double tinggi = Double.parseDouble(inputTinggi.getText());
      
      Segitiga segitiga = new Segitiga(alas, tinggi);
      labelHasil.setText("Luas Segitiga: " + segitiga.hitungLuas());
    } else if (e.getSource() == btnKembali) {
      new MainFrame();
      dispose();
    }
  }

}
