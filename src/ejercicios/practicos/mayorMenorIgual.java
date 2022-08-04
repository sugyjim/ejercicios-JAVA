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
public class mayorMenorIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedir dos numeros por teclado e indicar si uno es mayor que ootre o si son iguales

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un nuemro");
        int num = sc.nextInt();
        System.out.println("ingrese el segundo nuemro");
        int num2 = sc.nextInt();

        if (num <= num2) { // aqui hay mas de doscondiciones si el numero es meno y si es igual
            if (num == num2) { // se anida este if paravalidar la igualdad
                System.out.println("son iguales");

            } else {

                System.out.println("el numero 2 es" + num2 + "es mayor");
            }

        } else {
            System.out.println("el numero" + num + "es mayor");//se dduce que si noes meno ni es igual entonces es mayor

        }
    }

}
