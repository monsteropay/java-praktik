/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author Lk09Nu42UTY
 */
public class Menu extends JFrame {
    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem fopen, fclose, fsave, eundo, ecopy, epaste;
    
    public Menu() {
        initComponen();
        initform();
        
    }

    private void initComponen() {
        menuBar = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');
        edit = new JMenu("Edit");
        edit.setMnemonic('E');
        fopen = new JMenuItem("Open");
        fopen.setMnemonic('O');
        fclose = new JMenuItem("Close");
        fclose.setMnemonic('L');
        fsave = new JMenuItem("Save");
        fsave.setMnemonic('S');
        eundo = new JMenuItem("Undo");
        eundo.setMnemonic('U');
        ecopy = new JMenuItem("Copy");
        ecopy.setMnemonic('C');
        epaste = new JMenuItem("Paste");
        epaste.setMnemonic('X');
                
    }

    private void initform() {
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        file.add(fopen);
        file.add(fclose);
        file.add(fsave);
        edit.add(ecopy);
        edit.add(epaste);
        edit.add(eundo);
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Menu();
    }
    
}
