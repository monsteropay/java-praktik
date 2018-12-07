/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
/**
 *
 * @author budis
 */
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorService cs = new CalculatorService();
        
        CalculatorAdvanceService cas = new CalculatorAdvanceService();
        
        CalculatorBeras cb = new CalculatorBeras();
        
        CalculatorBagus cbg = new CalculatorBagus();
        
        Scanner input = new Scanner(System.in);
        
        int menu;

        do{           


            System.out.println("1. Kali");

            System.out.println("2. Bagi");

            System.out.println("3. Tambah");

            System.out.println("4. Kurang");
            
            System.out.println("5. Advance Kalkulator");
            
            System.out.println("6. Keluar");

            System.out.print("Pilih [1...6] ");

            menu = input.nextInt();

            System.out.println("");

               switch (menu) {

                    case 1:

                        System.out.println("x");
                        
                        double x = input.nextDouble();
                        
                        System.out.println("y");
                        
                        double y = input.nextDouble();
                        
                        System.out.println("hasil : "+x*y);
                        
                        break;



                    case 2:
                        
                        System.out.println("x");
                        
                        double x = input.nextDouble();
                        
                        System.out.println("y");
                        
                        double y = input.nextDouble();
                        
                        System.out.println("hasil : "+x/y);
                        
                        break;


                    case 3:
                        
                        System.out.println("x");
                        
                        double x = input.nextDouble();
                        
                        System.out.println("y");
                        
                        double y = input.nextDouble();
                        
                        System.out.println("hasil : "+x+y);
                        
                        break;



                    case 4:
                        
                        System.out.println("x");
                        
                        double x = input.nextDouble();
                        
                        System.out.println("y");
                        
                        double y = input.nextDouble();
                        
                        System.out.println("hasil : "+x-y);
                        
                        break;
                        
                        
                    case 5:
                        
                        break;
                        
                        
                    case 6:
                        
                        break;
              }



            }while(menu!=4);        

    }
    
    
}
