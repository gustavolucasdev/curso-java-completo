package com.gustavolucasdev.modulo05ArraysListas.Praticas;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de valores: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("Average height: %.2f%n", avg);

        sc.close();

    }
}
