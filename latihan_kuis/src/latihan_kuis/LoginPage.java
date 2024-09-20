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

public class LoginPage extends JFrame {
    private static final String USERNAME = "123220052";
    private static final String PASSWORD = "123220052";

    private final JTextField fnama = new JTextField(10);
    private final JPasswordField fpass = new JPasswordField(10);

    private final JLabel lnama = new JLabel(" Username : ");
    private final JLabel lpass = new JLabel(" Password : ");

    private final JButton btnLogin = new JButton("Login");
    private final JButton btnCancel = new JButton("Cancel");

    public LoginPage() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,200);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(lpass);
        add(fpass);
        add(btnLogin);
        add(btnCancel);

        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        lpass.setBounds(10, 40, 120, 20);
        fpass.setBounds(130, 40, 150, 20);
        btnLogin.setBounds(40, 90, 100, 20);
        btnCancel.setBounds(160, 90, 100, 20);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputUsername = fnama.getText();
                String inputPassword = new String(fpass.getPassword());
                
                if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                    JOptionPane.showMessageDialog(null, "Login berhasil");
                    new MainMenu();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau password salah");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Login");
        setVisible(true);
    }
}