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
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // para ingresar un nunmero y me arroje una letra de accsii
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un nuemro");
         int num=sc.nextInt();
         
         char caracter=(char)num;
         System.out.println("el numro"+ num+"corresponde a la "+ caracter);
                 
         
         
    }
    
}
