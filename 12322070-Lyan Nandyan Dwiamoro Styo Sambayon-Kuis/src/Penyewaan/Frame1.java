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
 *
 * @author Lab Informatika
 */
public class Frame1 extends JFrame implements ActionListener{
    JLabel header = new JLabel("Pilihan Kendaraan");
    JButton motor = new JButton ("Motor");
    JButton mobil = new JButton ("Mobil");

    public Frame1() {
    setTitle("Menu Jenis");
    setLayout(new BorderLayout());
    setLocationRelativeTo(null);
    add(header,"North");
    add(motor,"West");
    add(mobil,"East");
    
    motor.addActionListener(this);
    mobil.addActionListener(this);

    pack();
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(200,100);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == motor){
        new Frame2_3("Motor");
        this.dispose();
        }else if(e.getSource() == mobil){
        new Frame2_3("Mobil");
        this.dispose();
        }
    }
    
    

}
