
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class q6 {

   
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        double numerosCorretos = 1;
        double linhasIguais = 1;
        double colunasIguais = 1;
        double diagonaisIguais = 1;

    
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    numerosCorretos = 0;
                }

                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {

                        if (i != x || j != y) {
                            if (matriz[i][j] == matriz[x][y]) {
                                numerosCorretos = 0;
                            }
                        }
                    }
                }
            }
        }

     
        int somaLinha = matriz[0][0] + matriz[0][1] + matriz[0][2];

        for (int i = 1; i < 3; i++) {
            int soma = matriz[i][0] + matriz[i][1] + matriz[i][2];

            if (soma != somaLinha) {
                linhasIguais = 0;
            }
        }

        
        int somaColuna = matriz[0][0] + matriz[1][0] + matriz[2][0];

        for (int j = 1; j < 3; j++) {
            int soma = matriz[0][j] + matriz[1][j] + matriz[2][j];

            if (soma != somaColuna) {
                colunasIguais = 0;
            }
        }

      
        int diagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int diagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (diagonalPrincipal != diagonalSecundaria) {
            diagonaisIguais = 0;
        }

        
        if (numerosCorretos == 1 &&
            linhasIguais == 1 &&
            colunasIguais == 1 &&
            diagonaisIguais == 1) {

            System.out.println("\nA matriz é mágica!");

        } else {

            System.out.println("\nA matriz NÃO é mágica.");
            System.out.println("\nCondições não atendidas:");

            if (numerosCorretos == 0) {
                System.out.println("- Não contém todos os números de 1 a 9 sem repetição.");
            }

            if (linhasIguais == 0) {
                System.out.println("- As linhas não possuem a mesma soma.");
            }

            if (colunasIguais == 0) {
                System.out.println("- As colunas não possuem a mesma soma.");
            }

            if (diagonaisIguais == 0) {
                System.out.println("- As duas diagonais não possuem a mesma soma.");
            }
        }

     
    }
}