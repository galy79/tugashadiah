/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumferdinad;

import java.util.Scanner;

public class TugaspraktikumFerdinad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
     int[]Bil=new int[100];
     int Max,Min;
     int i;
     
     for(i=1;i<=5;i++){
      System.out.print("Nilai ke-"+i+":");
      Bil[i]=input.nextInt();
     }
     Max=0;
     Min=Bil[1];
     for(i=1;i<=5;i++){
         if(Max<Bil[i]){
          Max=Bil[i];
          
         }
         else if(Min>Bil[i]){
            Min=Bil[i];
         }
     }
     System.out.println();
     System.out.println("Nilai MAX:"+Max);
     System.out.println("Nilai MIN:"+Min);
    }
}
    
    

