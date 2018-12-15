/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lk09Nu42UTY
 */
public class FlowLayout extends JFrame{
    JLabel lnama, lnim;
    JTextField tfnama, tfnim;
    JButton bOk, bcancel;
    
    public FlowLayout() {
        super("Flow Layout");
        initComponen();
        initLayout();
    }

    private void initComponen() {
        lnama = new JLabel("Nama");
        lnim = new JLabel("Nim");
        tfnama = new JTextField(20);
        tfnim = new JTextField(20);
        bOk = new JButton("OK");
        bcancel = new JButton("Cancel");
    }

    private void initLayout() {
        setLayout(new java.awt.FlowLayout());
        add(lnama);
        add(tfnama);
        add(lnim);
        add(tfnim);
        add(bOk);
        add(bcancel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FlowLayout();
    }
}
