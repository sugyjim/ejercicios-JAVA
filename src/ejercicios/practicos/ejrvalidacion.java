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
public class ejrvalidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // realizar una suma del 1 al numero que indique ,este debe sermayorque 1
   
        int suma=0;
    int num=0;
        
        Scanner sc= new Scanner(System.in);
            System.out.println("ingrese el numro que desea sumar");
            num=sc.nextInt();
            
            if(num>1){
             suma=suma+num;
            }else{
            
            System.out.println("ingresa un nuemro mayor a 1");
            }
             for(int i=0;i<num;i++){
                  suma=suma+i;
                 
             }
             System.out.println("la suma es:"+ "" +suma);
             }
            
            
            }
    
    
    
    
    
    
    
    
    
    

