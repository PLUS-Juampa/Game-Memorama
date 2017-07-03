/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author juampa
 */
public class classRandomPrueba {
    


/**
 *
 * @author Picaporte
 */

   

    
    public  static void main(String[] args){
         
        int n=10;  //numeros aleatorios
       int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;
        
        
        //se rellena una matriz ordenada del 1 al 31(1..n)
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
         //se imprime el resultado;
        System.out.println("El resultado de la matriz es:");
        for(int i=0;i<n;i++){
        System.out.println(resultado[i]);
        }
   }
}

