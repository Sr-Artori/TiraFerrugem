
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class q2 {

  
    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);
     double[][] t = new double [4][4];
     double p,s,sp=0,ss=0,ms;
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.println("Informe os numeros");
            t [i][j] = ler.nextDouble(); }
        
    
        }
           System.out.println("diagonal primaria");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            if (i==j){
                p=t[i][j];
             
                System.out.println(t[i][j]);
                sp = sp+p;        
            } } }
          System.out.println("diagonal secundaria");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
         
                if ( i + j == 3) {
                s=t[i][j];
                  
                System.out.println(t[i][j]);    
                ss = ss+s;
                
                    
                }
              }
          
  
        }
        
            if ( sp < ss ){
                System.out.println("A soma da diagonal secundaria e maior"); 
                
            }
            if ( ss < sp) {
                System.out.println("A soma da diagonal primaria e maior");
                
            }
            else{
                System.out.println("A soma das diagonais sao iguais");
                
            }
    }
    
}
