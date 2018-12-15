/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lk09Nu42UTY
 */
public class GridLayout extends JFrame{
    JLabel lusername, lpassword;
    JTextField tfusername;
    JPasswordField password;
    JButton blogin, bcancel;
    
    public GridLayout() {
        super("Grid Layout");
        initComponen();
        initLayout();
    }

    private void initComponen() {
        lusername = new JLabel("Username");
        lpassword = new JLabel("password");
        tfusername = new JTextField(20);
        password = new JPasswordField(20);
        blogin = new JButton("Login");
        bcancel = new JButton("Cancel");
    }

    private void initLayout() {
        setLayout(new java.awt.GridLayout(3, 2));
        add(lusername);
        add(tfusername);
        add(lpassword);
        add(password);
        add(blogin);
        add(bcancel);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new GridLayout();
    }
}
