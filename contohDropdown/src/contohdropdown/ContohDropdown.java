/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohdropdown;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContohDropdown extends JFrame {
    private JComboBox<String> dropdown;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton submitButton;

    public ContohDropdown() {
        setTitle("GUI Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Dropdown
        String[] options = {"Option 1", "Option 2", "Option 3"};
        dropdown = new JComboBox<>(options);
        dropdown.setBounds(50, 20, 200, 30);

        // Radio Buttons
        radioButton1 = new JRadioButton("Option A");
        radioButton2 = new JRadioButton("Option B");
        radioButton1.setBounds(50, 60, 100, 30);
        radioButton2.setBounds(150, 60, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 100, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) dropdown.getSelectedItem();
                String radioButtonSelected = radioButton1.isSelected() ? "Option A" : "Option B";
                JOptionPane.showMessageDialog(ContohDropdown.this, "Dropdown Selection: " + selectedOption + "\nRadio Button Selection: " + radioButtonSelected);
            }
        });

        // Adding components to the frame
        setLayout(null);
        add(dropdown);
        add(radioButton1);
        add(radioButton2);
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContohDropdown();
            }
        });
    }
}

