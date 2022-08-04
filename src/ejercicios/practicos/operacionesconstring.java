/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

import javax.swing.JOptionPane;

/**
 *
 * @author WD GREEN
 */
public class operacionesconstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //manipular cadena vocales y espacio
       //contar cuantas vocales tiene un frase por consola por el usuario
       String texto=JOptionPane.showInputDialog(null,"escriba una cadena");
        texto=texto.toLowerCase(); //no imórta si son mayusculas o minusculas
         char vocales[]={'a','e','i','o','u'};
         char caracteractual;
         int contadorvocales=0; 
         
         
         for(int i=0; i <texto.length();i++){
         caracteractual= texto.charAt(i);
         
           for(int j=0; j<vocales.length;j++){
               
               
            if(vocales [j]== caracteractual){
           
                contadorvocales ++;
                
                
                
            }
            
           
           }
         
         }
         System.out.println(contadorvocales);
           
    }
    
}
