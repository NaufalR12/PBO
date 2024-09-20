/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_kuis;

/**
 *
 * @author LENOVO
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HasilSegitiga extends JFrame {
    JButton btnKembali = new JButton("Kembali");
    public HasilSegitiga(double alas, double tinggi) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,200);
        
        btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                dispose();
            }
        });

        double luas = 0.5 * alas * tinggi;
        JLabel hasilLuas = new JLabel("Luas Segitiga: " + luas);

        setLayout(null);
        add(hasilLuas);
        add(btnKembali);
        hasilLuas.setBounds(125, 10, 200, 20);
        btnKembali.setBounds(125, 50, 100, 20);
        setTitle("Hasil Segitiga");
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
