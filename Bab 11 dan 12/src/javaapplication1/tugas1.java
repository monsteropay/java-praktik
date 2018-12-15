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
public class tugas1 extends JFrame{
    JButton bjava, bphp, bandroid, bios, bobj;
    
    public tugas1() {
        super("Flow Layout Pertama");
        initComponen();
        initLayoout();
    }

    private void initComponen() {
        bjava = new JButton("JAVA");
        bphp = new JButton("PHP");
        bandroid = new JButton("ANDROID");
        bios = new JButton("IOS");
        bobj = new JButton("Objective-C");
    }

    private void initLayoout() {
        setLayout(new java.awt.FlowLayout());
        add(bjava, "JAVA");
        add(bphp, "PHP");
        add(bandroid, "ANDROID");
        add(bios, "IOS");
        add(bobj, "Objective-C");
        setVisible(true);
        setSize(150,150);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new tugas1();
    }
}
