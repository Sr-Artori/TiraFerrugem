
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
     double m,mn,mmn,soma=0;
     int qta=0,qtm=0;
     double [] n = new double[10];
     
        for (int i = 0; i < 10; i++) {

        System.out.println("Informe a nota");
        n [i] = ler.nextDouble();
         soma = n[i]+ soma;
        }
        m = soma/10;
        mn =  n[0];
        mmn = n[0];
        
        for (int i = 0; i < 10; i++) {
            if (mn < n[i]){
                mn = n[i];   
            }
            if (n[i]<mmn){
              mmn=  n[i];
              
            }
            
            
        }
        for (int i = 0; i < 10; i++) {
            if(n[i]<m){
                qta++;
                
            }
            if (7<=n[i]){
                qtm++;
            }
            
        }
        
        System.out.println("A MEDIA DA TURMA E:"+m);
        System.out.println("A MAIOR NOTA E:"+mn);
        System.out.println("A MENOR NOTA E:"+mmn);
        System.out.println("A QUANTIDADE DE ALUNO COM NOTA MAIOR OU IGUAL A 7\n" +qtm);
        System.out.println("A QUANTIDADE DE ALUNOS COM A NOTA ABAIXO DA MEDIA\n "+ qta);
        
 
     
     
      
    }
    
}
