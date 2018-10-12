/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author budis
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class tugas2 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tugas2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(tugas2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(tugas2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(tugas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        String n1;
            n1 = JOptionPane.showInputDialog("Number 1");
            String n2;
            n2 = JOptionPane.showInputDialog("Number 2");
            String n3;
            n3 = JOptionPane.showInputDialog("Number 3");
            
            String msg = "Anda memasukkan angka " + n1 + ", " + n2 + " dan " + n3;
            JOptionPane.showMessageDialog(null, msg);
    }         
}
