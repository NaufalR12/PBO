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

public class LingkaranPage extends JFrame {
    JTextField fjari = new JTextField(10);

    JButton btnHasil = new JButton("Hasil");

    public LingkaranPage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnHasil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double jari = Double.parseDouble(fjari.getText());
                    new HasilLingkaran(jari);
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Jari-jari:"));
        panel.add(fjari);
        panel.add(btnHasil);

        add(panel);
        pack();
        setTitle("Lingkaran Page");
        setVisible(true);
    }
}

