/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {

  // Declare components
  Label lblUsername;
  TextField txtUsername;
  Label lblPassword;
  TextField txtPassword;
  Button btnLogin;
  Button btnCancel;

  public LoginForm() {
    super("Login");

    // Create components
    lblUsername = new Label("Username:");
    txtUsername = new TextField(20);
    lblPassword = new Label("Password:");
    txtPassword = new TextField(20);
    btnLogin = new Button("Login");
    btnCancel = new Button("Cancel");

    // Add components to the frame
    add(lblUsername);
    add(txtUsername);
    add(lblPassword);
    add(txtPassword);
    add(btnLogin);
    add(btnCancel);

    // Set layout
    setLayout(new FlowLayout());

    // Add action listeners
    btnLogin.addActionListener(this);
    btnCancel.addActionListener(this);

    // Set frame size and visibility
    setSize(300, 150);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == btnLogin) {
      // Login logic here
      String username = txtUsername.getText();
      String password = txtPassword.getText();
      // Perform login validation
      // If successful, display success message or redirect to another frame
      // If unsuccessful, display error message
    } else if (ae.getSource() == btnCancel) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    new LoginForm();
  }
}

