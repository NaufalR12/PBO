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

public class MainMenu extends JFrame {
    JButton btnSegitiga = new JButton("Segitiga");
    JButton btnLingkaran = new JButton("Lingkaran");
    JButton btnLogout = new JButton("Logout");

    public MainMenu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,200);

        btnSegitiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SegitigaPage();
                dispose();
            }
        });

        btnLingkaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LingkaranPage();
                dispose();
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        add(btnSegitiga);
        add(btnLingkaran);
        add(btnLogout);
        
        btnSegitiga.setBounds(125, 10, 100, 20);
        btnLingkaran.setBounds(125, 50, 100, 20);
        btnLogout.setBounds(125, 90, 100, 20);
        setVisible(true);
    }
}
