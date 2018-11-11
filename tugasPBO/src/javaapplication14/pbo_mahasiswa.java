/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

/**
 *
 * @author budis
 */
public class pbo_mahasiswa {
    
ArrayList<Mahasiswa> dataMahaiswa;

    Scanner input = new Scanner(System.in);

    public pbo_mahasiswa() {
        this.dataMahaiswa = new ArrayList<>();
    }
    public void menuAwal(){
        int menu;
        do{           

            System.out.println("tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            System.out.println("");
               switch (menu) {
                    case 1:
                        inputData();

                        break;

                    case 2:

                        tampilData();

                        break;

                    case 3:

                        sortingData();

                        break;

                    case 4:

                        break;
                }

            }while(menu!=4);        
    }
    
    public void inputData(){

    String nim;

    String nama;

    float ipk;              
       
    System.out.print("Masukan nim     : ");

    nim = input.next();

    System.out.print("Masukan nama    : ");

    nama = input.next();        

    System.out.print("Masukan ipk     : ");

    ipk = input.nextFloat();

    System.out.println("");
     
    Mahasiswa mhs = new Mahasiswa(nim, nama, ipk);

    dataMahaiswa.add(mhs);

    }    

    

    public void tampilData(){

        for (int i=0;i<dataMahaiswa.size();i++){

            System.out.println("Data ke-"+(i+1));

            System.out.println("nim : "+dataMahaiswa.get(i).nim);

            System.out.println("nama: "+dataMahaiswa.get(i).nama);

            System.out.println("ipk : "+dataMahaiswa.get(i).ipk);

        }

        System.out.println("");    

    }

    

    public void sortingData(){

        int menuSort;
         
        System.out.println("sorting data mahasiswa");

        System.out.println("--------------------------");        

        System.out.println("1. sorting by nim");

        System.out.println("2. sorting by nama");

        System.out.println("3. sorting by ipk");

        System.out.println("4. kembali ke awal");

        System.out.print("Pilih : ");

        menuSort = input.nextInt();
           

        do{

            switch (menuSort) {

                case 1:

                sortNim();

                    break;

                case 2:

                sortNama();

                    break;

                case 3:

                sortIpk();

                    break;

                case 4:

                menuAwal();

                    break;                

                default:

                    break;
            }

        }while(menuSort!=4);

    }
    public void sortNim(){

        Collections.sort(dataMahaiswa, (Mahasiswa m1, Mahasiswa m2) -> String.valueOf(m1.nim).compareTo(m2.nim));

        sortingData();        
    }
    public void sortNama(){

        Collections.sort(dataMahaiswa, (Mahasiswa m1, Mahasiswa m2) -> String.valueOf(m1.nama).compareTo(m2.nama));

        sortingData();
    }

    public void sortIpk(){        

        Collections.sort(dataMahaiswa, (Mahasiswa m1, Mahasiswa m2) -> Float.valueOf(m1.ipk).compareTo(m2.ipk));

        sortingData();    
    }   
}
    