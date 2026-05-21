package com.gustavolucasdev.modulo05ArraysListas.exercicios.numerosparesvetor;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = sc.nextInt();
        int[] vect = new int[qtdNumeros];

        sc.nextLine();
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            int numeros = sc.nextInt();
            vect[i] = numeros;
        }

        System.out.println("NUMEROS PARES:");
        int qtdPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                qtdPares++;
            }
        }
        System.out.println(" ");
        System.out.println("QUANTIDADE DE PARES: " + qtdPares);

        sc.close();
    }
}
