package com.gustavolucasdev.modulo05ArraysListas.exercicios.somavetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qntd = sc.nextInt();
        double[] valores = new double[qntd]; // Inicializando o vetor

        for (int i = 0; i < valores.length; i++) { // Adicionando valores
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            valores[i] = num;
        }

        System.out.print("VALORES: ");

        for (int i = 0; i < valores.length; i++) { // Mostrando valores
            System.out.printf("%.2f ", valores[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < valores.length; i++) { // Somando os valores
            sum += valores[i];
        }
        System.out.println(" "); //Gambiarra
        System.out.printf("SOMA: %.2f%n", sum);

        double avg = sum / valores.length; // Media dos valores
        System.out.printf("MEDIA: %.2f%n", avg);

        sc.close();
    }
}
