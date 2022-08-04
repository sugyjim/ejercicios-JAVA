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
public class numeropar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //comprobar si el numero ingresado es par
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un nuemro");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero" + num + "es par");

        } else {

            System.out.println("el numero" + num + "es impar");

        }

    }
}