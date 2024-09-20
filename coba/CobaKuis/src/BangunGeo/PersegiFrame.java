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
import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author rafli
 */
public class PersegiFrame extends JFrame implements ActionListener {
  JPanel panel;
  JLabel labelSisi, labelHasil;
  JTextField inputSisi;
  JButton btnKembali, btnHasil;

  public PersegiFrame() {
    panel = new JPanel();
    labelSisi = new JLabel("Masukkan Sisi");
    labelHasil = new JLabel();
    inputSisi = new JTextField();
    btnKembali = new JButton("Kembali");
    btnHasil = new JButton("Hasil");
    
    add(panel);
    labelSisi.setHorizontalAlignment(SwingConstants.CENTER);
    labelHasil.setHorizontalAlignment(SwingConstants.CENTER);
    inputSisi.setHorizontalAlignment(SwingConstants.CENTER);
    labelSisi.setBounds(0, 10, 300, 20);
    inputSisi.setBounds(90, 35, 120, 30);
    labelHasil.setBounds(0, 80, 300, 20);
    btnHasil.setBounds(150, 210, 80, 35);
    btnKembali.setBounds(60, 210, 80, 35);
    
    panel.setLayout(null);
    panel.add(labelSisi);
    panel.add(labelHasil);
    panel.add(inputSisi);
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
      double sisi = Double.parseDouble(inputSisi.getText());
      Persegi persegi = new Persegi(sisi);
      labelHasil.setText("Luas Persegi: " + persegi.hitungLuas());
    } else if (e.getSource() == btnKembali) {
      new MainFrame();
      dispose();
    }
  }
  
}
