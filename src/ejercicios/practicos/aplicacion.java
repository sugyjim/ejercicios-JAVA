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
public class aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
// crear una aplicacion introdiciendo numeros hasta qiue se introduce un -1
        
//cuantos numeros se ingresaron
Scanner sc= new Scanner(System.in);
           
        System.out.println("ingrese el numero");
          int   num= sc.nextInt();;
            int contador=0;      
            
          while(num != -1){
             
             contador++;
           num=sc.nextInt();
          }
          System.out.println(num + "la cantidad de numeros es: "+ contador);
                  
    }
    
}
