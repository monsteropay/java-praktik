/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Lk09Nu42UTY
 */
public class BorderLayout extends JFrame{
    JButton bnorth, bsouth, beast, bwest, bcenter;
    
    public BorderLayout() {
        super("BorderLayout");
        initComponen();
        initLayout();
    }

    private void initComponen() {
        bnorth = new JButton("North");
        bsouth = new JButton("South");
        beast = new JButton("East");
        bwest = new JButton("West");
        bcenter = new JButton("Center");
    }

    private void initLayout() {
        setLayout(new java.awt.BorderLayout());
        add(bnorth, "North");
        add(bsouth, "South");
        add(beast, "East");
        add(bwest, "West");
        add(bcenter, "Center");
        setVisible(true);
//        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderLayout();
    }
    
}
