
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class q5 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] original = new int[20];

        int trocas = 0;
        int comparacoes = 0;

   
        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < 20; i++) {
            vetor[i] = ler.nextInt();
            original[i] = vetor[i];
        }

       
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {

                comparacoes++;

                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                    trocas++;
                }
            }
        }

       
        double mediana = (vetor[9] + vetor[10]) / 2.0;

    
        System.out.println("\nVetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }

       
        System.out.println("\n\nVetor ordenado:");

        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        
        System.out.println("\n\nQuantidade de trocas: " + trocas);
        System.out.println("Quantidade de comparações: " + comparacoes);
        System.out.println("Mediana: " + mediana);

        
    }
}
       

    
