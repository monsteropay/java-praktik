/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author Lk09Nu42UTY
 */
public class FreeLayout extends JFrame{
    
    JLabel lnama, ljeniskelamin, lagama,lhobby;
    JTextField tfnama;
    JRadioButton rbl, rbp;
    JComboBox cbagama;
    JCheckBox cbasket, crenang, csenam;
    JButton bsave;
    
    public FreeLayout() {
        initCompenen();
        initLayout();
    }

    private void initCompenen() {
        lnama = new JLabel("Nama");
        ljeniskelamin = new JLabel("Jenis Kelamin");
        lagama = new JLabel("Agama");
        lhobby = new JLabel("Hobby");
        tfnama = new JTextField(20);
        rbl = new JRadioButton("Laki-Laki");
        rbp = new JRadioButton("Perempuan");
        ButtonGroup g = new ButtonGroup();
        g.add(rbl);
        g.add(rbp);
        String agama[] = {"Islam", "Kristen", "Katholik", "Hindu", "Budha"};
        cbagama = new JComboBox(agama);
        cbasket = new JCheckBox("Basket");
        crenang = new JCheckBox("Renang");
        csenam = new JCheckBox("Senam");
        bsave = new  JButton("Simpan");
    }

    private void initLayout() {
        setLayout(null);
        add(lnama);
        add(tfnama);
        add(ljeniskelamin);
        add(rbl);
        add(rbp);
        add(lagama);
        add(cbagama);
        add(lhobby);
        add(cbasket);
        add(crenang);
        add(csenam);
        add(bsave);
        lnama.setBounds(10, 10, 120, 20);
        tfnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbl.setBounds(128, 35, 100, 20);
        rbp.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cbagama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbasket.setBounds(128, 85, 100, 20);
        crenang.setBounds(230, 85, 150, 20);
        csenam.setBounds(350, 85, 120, 20);
        bsave.setBounds(100, 130, 120, 20);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new FreeLayout();
    }
    
}
