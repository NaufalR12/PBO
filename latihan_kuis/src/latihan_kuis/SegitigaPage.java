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

public class SegitigaPage extends JFrame {
    JTextField falas = new JTextField(10);
    JTextField ftinggi = new JTextField(10);

    JButton btnHasil = new JButton("Hasil");

    public SegitigaPage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnHasil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double alas = Double.parseDouble(falas.getText());
                    double tinggi = Double.parseDouble(ftinggi.getText());
                    new HasilSegitiga(alas, tinggi);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Alas:"));
        panel.add(falas);
        panel.add(new JLabel("Tinggi:"));
        panel.add(ftinggi);
        panel.add(btnHasil);

        add(panel);
        pack();
        setTitle("Segitiga Page");
        setVisible(true);
    }
}
