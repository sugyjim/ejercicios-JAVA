/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

/**
 *
 * @author WD GREEN
 */
public class numerosdivisibles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // mostrar del 1 al 100  y que sean divibles por 2 y 3 (ambos)
        
         
        for(int i =0; i<=100;i++) 
            if(i%2==0 && i%3==0){
            System.out.println(i);
                    }
    }
    
}
