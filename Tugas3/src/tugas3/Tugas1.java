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
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
    float rata;
    
        System.out.println("number 1 = ");
        n1 = input.nextInt();
        System.out.println("number 2 = ");
        n2 = input.nextInt();
        System.out.println("number 3 = ");
        n3 = input.nextInt();
        
        rata = (n1 + n2 + n3) / 3;
        
        System.out.println("Rata rata = " + rata);
    }
    
}
