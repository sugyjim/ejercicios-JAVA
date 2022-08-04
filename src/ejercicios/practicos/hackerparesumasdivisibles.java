/*
 * Dada una matriz de enteros y un entero positivo, determinar el número depares dondey+es divisible por.
 */
package ejercicios.practicos;

/**
 *
 * @author WD GREEN
 */
public class hackerparesumasdivisibles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cuente el número de pares en una matriz que tiene sumas 
        //que son uniformemente divisibles por un número dado.
   
        int k=3;
        int n=6;
        int contador=0;
        
      //  int ar[]=new int [n];
      int ar[]={1,3,2,6,1,2};
        for(int i=0;i<ar.length;i++){
            
        for(int j=1;j<ar.length;j++){
            
            if((ar[i]+ar[j])%k==0 && ar[i]<ar[j] ){
            
                       
                          contador++;
            }
         
                   
        }
            
              
                 
                 }
        System.out.print(contador); 
            
    }
}
        
    
    



