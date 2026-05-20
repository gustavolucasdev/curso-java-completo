package com.gustavolucasdev.modulo05ArraysListas.exercicios.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numeros = sc.nextInt();
        int[] vetor = new int[numeros]; //Criando o vetor

        sc.nextLine();
        for (int i = 0; i < vetor.length; i++) { // Inserindo valores no vetor
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vetor[i] = num;
        }

        System.out.println("Números negativos:");

        for (int i = 0; i < vetor.length; i++) { // Checando numeros negativos
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}