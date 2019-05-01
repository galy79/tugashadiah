/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasteoriferdinand;

import java.util.Scanner;

public class TugasTeoriFerdinand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Nilai Mahasiswa");
        //variable
        String nama;
        int tugas1,tugas2,tugas3,mid,finel;
        //inputan
        System.out.print("Masukkan Nama Anda : ");
        nama = input.next();
        
        System.out.print("Masukkan Nilai Tugas Pertama : ");
        tugas1 = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas Kedua : ");
        tugas2 = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas Ketiga : ");
        tugas3 = input.nextInt();
        
        System.out.print("Masukkan Nilai MID : ");
        mid = input.nextInt();
        
        System.out.print("Masukkan Nilai Final : ");
        finel = input.nextInt();
        System.out.println();
       //rumus
        double rata2 = (double)(tugas1+tugas2+tugas3)/3;
        double total = (double)(rata2*30/100)+(mid*30/100)+(finel*40/100);
        //seleksi
        if (total >=80 && total<=100){
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Akhir = "+total);
        System.out.println("Dapat Nilai A");
        }
        else if(total >=60 && total<=79){
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Akhir = "+total);
        System.out.println("Dapat Nilai B");
        }
        else if(total >=50 && total<=59){
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Akhir = "+total);
        System.out.println("Dapat Nilai C");
        }
        else if(total >=40 && total<=49){
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Akhir = "+total);
        System.out.println("Dapat Nilai D");
        }
        else{
        System.out.println("Nama = "+nama);
        System.out.println("Nilai Akhir = "+total);
        System.out.println("Dapat Nilai E");
        }
        
}    
}
    

