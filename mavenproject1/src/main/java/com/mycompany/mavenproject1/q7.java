
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class q7 {

    
    public static void main(String[] args) {
  
        Scanner ler = new Scanner(System.in);

        int[][] tabuleiro = new int[8][8];

       
        int navios = 0;
        int acertos = 0;
        int erros = 0;
        int repetidos = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = 0;
            }
        }

        
        System.out.println("CADASTRO DOS NAVIOS");

        while (navios < 5) {
            System.out.println("\nNavio " + (navios + 1));
            System.out.print("Digite a linha (0 a 7): ");
            int linha = ler.nextInt();

            System.out.print("Digite a coluna (0 a 7): ");
            int coluna = ler.nextInt();

          
            if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
                System.out.println("Posição inválida! Digite valores entre 0 e 7.");
            }

            else if (tabuleiro[linha][coluna] == 1) {
                System.out.println("Já existe um navio nessa posição!");
            }
      
            else {
                tabuleiro[linha][coluna] = 1;
                navios++;
                System.out.println("Navio colocado com sucesso!");
            }
        }

        System.out.println("\n=== BATALHA NAVAL ===");
        System.out.println("Você tem até 15 disparos.");

        int disparos = 0;

        while (disparos < 15 && acertos < 5) {

            System.out.println("\nDisparo " + (disparos + 1));
            System.out.print("Digite a linha (0 a 7): ");
            int l = ler.nextInt();

            System.out.print("Digite a coluna (0 a 7): ");
            int c = ler.nextInt();

          
            if (l < 0 || l > 7 || c < 0 || c > 7) {
                System.out.println("Posição inválida! O disparo não foi realizado.");
                continue;
            }

            if (tabuleiro[l][c] == 2.0 ||
                tabuleiro[l][c] == 3.0) {

                System.out.println("Disparo repetido!");
                repetidos++;
            }

            
            else if (tabuleiro[l][c] == 1) {

                System.out.println("ACERTO!");

                tabuleiro[l][c] = 2;

                acertos++;
            }

           
            else {

                System.out.println("ERRO!");

                tabuleiro[l][c] = 3;

                erros++;
            }

            disparos++;

            
            if (acertos == 5) {
                System.out.println("\nTodos os navios foram destruídos!");
            }
        }

     
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Disparos repetidos: " + repetidos);
        System.out.println("Total de disparos realizados: " + disparos);

        if (acertos == 5) {
            System.out.println("PARABÉNS! Você destruiu todos os navios!");
        } else {
            System.out.println("Fim dos disparos. Alguns navios não foram destruídos.");
        }

      
    }
}