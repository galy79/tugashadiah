/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuagas8;

import java.util.Scanner;

public class Tuagas8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String nama,alamat;
        char tipe;
        int bayar=0,kembali=0;
        
        
        System.out.println("Pendataan Pesawat");
        System.out.print("Nama: ");
        nama=input.next();
        System.out.print("Alamat: ");
        alamat=input.next();
        System.out.print("Tipe Pesawat: ");
        tipe=input.next().charAt(0);
       
        System.out.print("Bayar: Rp.");
        bayar=input.nextInt();
        int a=5000000, b=2000000, c=1000000;
        if (tipe=='A'){kembali=bayar-a;}
        else if(tipe=='B'){kembali=bayar-b;}
        else if(tipe=='C'){kembali=bayar-c;}
        
        System.out.println();
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Kembalian: Rp."+kembali);
    }
        
}
    
    

