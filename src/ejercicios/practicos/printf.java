/*La función System.out.printf de Java se puede utilizar para imprimir la salida formateada. El propósito de este ejercicio es probar su comprensión del formato de salida usando printf .

Para empezar, se le proporciona una parte de la solución en el editor; debe formatear e imprimir la entrada para completar la solución.

Formato de entrada

Cada línea de entrada contendrá una cadena seguida de un número entero .
Cada String tendrá un máximo decaracteres alfabéticos, y cada número entero estará en el rango inclusivo dea.

Formato de salida

En cada línea de salida debe haber dos columnas:
La primera columna contiene la Cadena y se justifica a la izquierda usando exactamentecaracteres.
La segunda columna contiene el número entero , expresado en exactamentedígitos; si la entrada original tiene menos de tres dígitos, debe rellenar los primeros dígitos de su salida con ceros.

Entrada de muestra

java 100
cpp 65
python 50
Salida de muestra

================================
java           100 
cpp            065 
python         050 
================================
Explicación

Cada cadena está justificada a la izquierda con espacios en blanco finales a través de la primeracaracteres. El primer dígito del entero es elcarácter, y cada número entero que era menor quedígitos ahora tiene ceros a la izquierda.
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author WD GREEN
 */
public class printf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          
  System.out.println("================================");
            for(int i=0;i<3;i++)
            {
              
                String s1=sc.next();
                int x=sc.nextInt();
                    
       
             System.out.printf("%-15s %03d\n", s1,x);

            }
            
             System.out.println("================================");
           // tabla de multiplicar
 //System.out.println*/
  /*     int N=2;
       int resultado=1;
      
           for (int i = 1; i <=10; i++) {
             resultado= N*i;
             System.out.println( N+" " +"x"+" "+i+" "+"="+ " "+resultado);
         }*/
   

    }
}
    
    

