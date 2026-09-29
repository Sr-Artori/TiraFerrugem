package com.mycompany.mavenproject1;

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] cinema = new int[10][12];
        int opcao = 0;

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                cinema[i][j] = 0;
            }
        }

        while (opcao != 6) {

            System.out.println("\n===== CINEMA =====");
            System.out.println("1 - Reservar um assento");
            System.out.println("2 - Cancelar uma reserva");
            System.out.println("3 - Exibir o mapa dos assentos");
            System.out.println("4 - Mostrar quantidade de assentos livres e ocupados");
            System.out.println("5 - Encontrar uma sequência de assentos livres");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    
                    System.out.print("Digite a fileira (1 a 10): ");
                    int fileira = ler.nextInt();

                    System.out.print("Digite o assento (1 a 12): ");
                    int assento = ler.nextInt();

                    if (fileira < 1 || fileira > 10
                            || assento < 1 || assento > 12) {

                        System.out.println("Posição inválida!");

                    } else if (cinema[fileira - 1][assento - 1] == 1) {

                        System.out.println("Esse assento já está ocupado!");

                    } else {

                        cinema[fileira - 1][assento - 1] = 1;
                        System.out.println("Assento reservado com sucesso!");
                    }

                    break;

                case 2:
                   
                    System.out.print("Digite a fileira (1 a 10): ");
                    fileira = ler.nextInt();

                    System.out.print("Digite o assento (1 a 12): ");
                    assento = ler.nextInt();

                    if (fileira < 1 || fileira > 10
                            || assento < 1 || assento > 12) {

                        System.out.println("Posição inválida!");

                    } else if (cinema[fileira - 1][assento - 1] == 0) {

                        System.out.println("Esse assento já está livre!");

                    } else {

                        cinema[fileira - 1][assento - 1] = 0;
                        System.out.println("Reserva cancelada com sucesso!");
                    }

                    break;

                case 3:
                    
                    System.out.println("\n===== MAPA DOS ASSENTOS =====");
                    System.out.println("0 = Livre | 1 = Ocupado\n");

                    System.out.print("     ");

                    for (int j = 0; j < 12; j++) {
                        System.out.printf("%3d", j + 1);
                    }

                    System.out.println();

                    for (int i = 0; i < 10; i++) {

                        System.out.printf("F%2d ", i + 1);

                        for (int j = 0; j < 12; j++) {
                            System.out.printf("%3d", cinema[i][j]);
                        }

                        System.out.println();
                    }

                    break;

                case 4:
                 
                    int livres = 0;
                    int ocupados = 0;

                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 12; j++) {

                            if (cinema[i][j] == 0) {
                                livres++;
                            } else {
                                ocupados++;
                            }
                        }
                    }

                    System.out.println("\nAssentos livres: " + livres);
                    System.out.println("Assentos ocupados: " + ocupados);

                    break;

                case 5:
                   
                    System.out.print("Quantas pessoas? ");
                    int quantidade = ler.nextInt();

                    if (quantidade <= 0 || quantidade > 12) {

                        System.out.println("Quantidade inválida!");

                    } else {

                        int encontrou = 0;

                        for (int i = 0; i < 10; i++) {

                            int contador = 0;

                            for (int j = 0; j < 12; j++) {

                                if (cinema[i][j] == 0) {
                                    contador++;
                                } else {
                                    contador = 0;
                                }

                                if (contador == quantidade) {

                                    int inicio = j - quantidade + 1;

                                    System.out.println(
                                            "Sequência encontrada na fileira "
                                            + (i + 1)
                                            + ", assentos "
                                            + (inicio + 1)
                                            + " até "
                                            + (j + 1)
                                    );

                                    System.out.print("Assentos disponíveis: ");

                                    for (int k = inicio; k <= j; k++) {
                                        System.out.print((k + 1) + " ");
                                    }

                                    System.out.println();

                                    encontrou = 1;
                                    break;
                                }
                            }

                            if (encontrou == 1) {
                                break;
                            }
                        }

                        if (encontrou == 0) {
                            System.out.println(
                                    "Não foi encontrada uma sequência de "
                                    + quantidade
                                    + " assentos consecutivos."
                            );
                        }
                    }

                    break;

                case 6:
                  
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

     
    }
}
