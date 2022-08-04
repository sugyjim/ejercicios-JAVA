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
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // imprimir una serie fibonacci 0,1,1,2,3,5,8,12,20,32,
        // se empieza con ceros y uno
        //se declaran tres variables un numero inicial a
        // el segundo numero b
       // y una tercera variable que suma el numero 1 con el numero 2 c;
       // se inicia el programa con un for
       
       
       int a=0;// numero inicial que es cero
       int b=1; // segundo numero que es 1
       int c=0; // este es  donde resulta el tercer numero de sumar a+b
       
       for(int i=0;i<10;i++ ){ // la variable i solo se utiliza para aumentar r iterar el ciclo hasta cumplir  la canridad de numero
          if(i<9){
       
       System.out.print(a +","); // es la primera instruccion imprimir el primer valor 
          }else{
          System.out.print(a);
          
          }
        c=a+b; // de aui se saca los valores de b y finalmente a que es la que se imprime.
        a= b;  // en la siguiente iteracion a ya vale 1
        b=c;   // b toma el valor siguiente y en proxima iteracion a toma el valor de b que viene siendo la suma
        
       
       }
        }
    }
    

