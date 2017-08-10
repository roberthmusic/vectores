/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*construir un vector de enteros llamado vecnumeros e inicializarlo con los
numeros: 11, -22, 33, -44, 55, -66, 77, -88, 99.

construir un vector de enteros llamado vpositivos, de longitud 10, que
contenga los numeros positivos de vecnumeros.

construir un vector de enteros llamado vecnegativos de longitud 10,
que contenga los numeros negativos de vecnumeros. Acumular la suma de los
valores positivos segun la variable llamada totalpositivos.

acumular la suma de los numeros negativos segun la variable totalnegativos.

imprimir por pantalla: el contenido de vecnumeros
el contenido de vecpositivos
el contenido de vecnegativos
*/


/**
 *
 * @author Español
 */
public class Vectores2 {
    
   
    
    public static void main (String[] args){
        
        int indicePositivo = 0;
        
        int i;
    
    int[] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
    
    int[] vecPositivos = new int [10];
    
    //vecnumeros.length = 9   //total indices
            
            for (i=0;i<vecNumeros.length;i++){

    System.out.print(vecNumeros[i]+" ");    
    

        
        if (vecNumeros[i]>0){
            
            vecPositivos[indicePositivo]=vecNumeros[i];
            
            indicePositivo++;
            
   
            
        }
  
    }
            
            
             System.out.println ("indicePositivo");
            
    
            
        for (i=0;i<vecPositivos.length;i++){

    System.out.print(vecPositivos[i]+" "); }
            
            
            
            
            
            
    
    
}
 
            
            
    
}
