/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjekGUI;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
class ObjekGUI {
public static void main(String[] args) {
GUI g = new GUI();
}
}
class GUI extends JFrame {
    final JTextField fnama = new JTextField(10);
    final JTextField fpass = new JTextField(10);
    JLabel lnama = new JLabel(" Username : ");
    JLabel lpass = new JLabel(" Password : ");
    JButton btnSave = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");
    
    public GUI() {
        setTitle("Login");
        setDefaultCloseOperation(3);
        setSize(350,200);
        ButtonGroup group = new ButtonGroup();
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lpass);
        add(fpass);
        add(btnSave);
        add(btnCancel);
        // setBounds(m,n,o,p)
        // m = posisi x; n = posisi y
        // o = panjang komponen; p = tinggi komponen
        lnama.setBounds(10,10,120,20);
        fnama.setBounds(130,10,150,20);
        lpass.setBounds(10,40,120,20);
        fpass.setBounds(130,40,150,20);
        btnSave.setBounds(40,90,100,20);
        btnCancel.setBounds(160,90,100,20);
        setVisible(true);
    }
}