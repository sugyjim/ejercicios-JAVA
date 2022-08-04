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
public class cuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el primer numero va en el centro
        //el siguiente encima a la derecha
        //la fila aneior de  la primera  sera la ultima fila
        //la columna a la derecha de la ultima columna sera la primera
      //  si el numero a colocarce la celda esta ocupada entonces se pon e debajo del ultimo numero
      
    /*  int n=3; // el tamaño de la matriz
      
      int[][] cuadrado_magico= new int [n][n];
      
      int fila=0;
      int colu=n/2; //para sacar la mitad de la matriz
      int f=0; //para almacenar la pocicion de la fila
      int c=0; // para almacenar la posicion de la columna
      int num=1; // los numeros que se ingresen
 /*     while (num<=n*n){
          
          A[fila][colu]=num;
           num++;
            f=fila;
            c=colu;

          
          fila=fila-1;
          colu=colu +1;
          
         if( fila==-1)
             fila=n-1;
         if(colu==n)
             colu=0;
         if(A[fila][colu]!= 0){
         fila=f;
         colu=c;
         
         }
      }
      num++;
      for(int i=0; i<n;i++){
          for( int j=0;j<n;j++)
      System.out.print(A[fila][colu]+" " );
      System.out.print("");
      }*/
      
    
    
    int N=4; //tamaño de la matriz
    int i_ant=0; // variable para guardar pociiones o temporal
    int j_ant=0; //variable para guardar la pocicion actualñ colu o temporal
    int punto_inicial=N/2; //para asegurara el centro de la ,matriz
    int [][] cuadrado_magico= new int [4][4];
    int temp=1; // lleva la cuebnta de los numeros, son los numeros ingresados 
    
    for(int i=0; i< cuadrado_magico.length;i++){
        for (int j=0;j< cuadrado_magico.length; j++){
         cuadrado_magico[i][j]=i;
        
      
    }
      
    }
    String imprimir=" ";
     for(int i=0; i< cuadrado_magico.length;i++){
      for (int j=0;j< cuadrado_magico.length; j++){
        imprimir= imprimir + cuadrado_magico[i][j];
        }
      imprimir=imprimir +"\n ";
     }System.out.println(imprimir);
    
  int i=0;
     int j= punto_inicial;
     
     
      while(temp< (N*N)){
      
      if(cuadrado_magico[i][j]==0){
          cuadrado_magico[i][j]= temp;
      
      
      
      }else{
      
       i= i_ant +1;
       j= j_ant;
       cuadrado_magico[i][j]=temp;
               
      }
      i_ant=i;
      j_ant=j;
      
      temp++;
      j++;
      i--;
      
      if(i<0 && j==N){
            i=N-1;
            j=0;
               
      }else if(i<0){
          i=i+N;
      
      
      
      }else if(i==N){
          j=0;
      
      
      }
      
      } 
      
      for (int x=0;x<N;x++){
    //    String resultado="";
        for(int y=0; y<N;y++){
      //      resultado=resultado +" "+cuadrado_magico[x][y];
        
        
        
        System.out.println(cuadrado_magico[i][j]);
        }
      }
      
    }
    
}
