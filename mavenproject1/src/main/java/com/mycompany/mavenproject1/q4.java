
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class q4 {

  
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int[][] rotacionada = new int[5][5];

        System.out.println("Digite os valores da matriz:");

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rotacionada[j][4 - i] = matriz[i][j];
            }
        }

       
        System.out.println("\nMatriz original:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

 
        System.out.println("\nMatriz rotacionada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotacionada[i][j] + " ");
            }
            System.out.println();
        }

    
    }}