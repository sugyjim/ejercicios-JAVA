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
public class imprimirseriehaker {
//serie: 2 6 14 30 62 126 254  510 1022 2046
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
   //     int arr[]=new int[t];
                
                
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
         for(int j=0;j<n; j++){
                 
           a= (int) (a + Math.pow(2, j)* b);
            
                             
          System.out.print(a  + " ");
                 
                
                
        }
         
        }
      in.close();
    
}    

    }

