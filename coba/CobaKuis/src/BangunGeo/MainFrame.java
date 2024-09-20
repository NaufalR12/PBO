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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

  JPanel panel;
  JLabel title;
  JButton btnPersegi, btnSegitiga;

  public MainFrame() {
    panel = new JPanel();
    title = new JLabel("PT XYZ");
    btnPersegi = new JButton("Persegi");
    btnSegitiga = new JButton("Segitiga");

    setSize(300, 300);
    add(panel);
    panel.setLayout(null);

    title.setHorizontalAlignment(SwingConstants.CENTER);
    title.setBounds(0, 10, 300, 20);
    btnPersegi.setBounds(98, 80, 100, 30);
    btnSegitiga.setBounds(98, 120, 100, 30);
    panel.add(title);
    panel.add(btnPersegi);
    panel.add(btnSegitiga);

    setLocationRelativeTo(null);
    setDefaultCloseOperation(3);
    setVisible(true);

    btnPersegi.addActionListener(this);
    btnSegitiga.addActionListener(this);
    
    
  }
 

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnPersegi) new PersegiFrame();
    else if (e.getSource() == btnSegitiga) new SegitigaFrame();
    dispose();
  }
}