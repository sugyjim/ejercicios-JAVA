/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author WD GREEN
 */
public class buclesHaheRan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // (a+2a la ceroxb),(a+2alacero.b+2ala 1.b)varuable
        // a.b,n,q y tque es cantidad de iteraciones.
        
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        int t=3;
        int a=2;
        int b=0;
       
         int q=2;
         int d=0;
         System.out.println("ingresa el primer numero");
                
           //     System.out.println("ingres el segundo numero");
                
             //   System.out.println("ingresa el tercer numero");
               
                        
                 for(int i=0;i<t;i++){
             a=sc.nextInt();
             b=sc.nextInt();
           
             System.out.println((a+(Math.pow(q, d))*b)+" /"+ (a+(Math.pow(q,d)*b+(Math.pow(q, d)*b))));
                 
        //     int n= a+(Math.pow(q, d))*b+""+ a+(Math.pow(q,d))*b+(Math.pow(q, d)*b;
                 
                 
                 }
    
    }
    
}
