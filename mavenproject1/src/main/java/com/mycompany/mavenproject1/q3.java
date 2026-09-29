/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author fef
 */
public class q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int [] n = new int [15];
       int [] nr = new int [15];
       int qtd=0;
       
        for (int i = 0; i < 15; i++) {
            
                
            
                System.out.println("Informe os numeros");
                n [i] = ler.nextInt();
                
                
            }
        for (int i = 0; i < 15; i++) {
            int rep = 0;
            for (int j = 0; j < qtd; j++) {
            if(n[i]==nr[j]){
                rep++;
            }         
            if (n[i]!=nr[j]){
                nr[qtd]= n[i];
                qtd++;
                
            }
            }
 
        }
        System.out.println("Primeiro vetor"+n);
        System.out.println("Segundo vetor"+nr);
        System.out.println("Quantidade de numero nao repetido"+qtd);
        }
        }
    
    

