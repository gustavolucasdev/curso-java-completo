package com.gustavolucasdev.modulo05ArraysListas.exercicios.maiores;

import java.util.Locale;
import java.util.Scanner;

public class Maiores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNum = sc.nextInt();
        double[] vect = new double[qtdNum];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            double valores = sc.nextDouble();
            vect[i] = valores;
        }

        double maior = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior){
                maior = vect[i];
            }
        }

        int posMaior = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > vect[posMaior]){
                posMaior = i;
            }
        }

        System.out.println("MAIOR VALOR: " + maior);
        System.out.println("POSICAO DO MAIOR VALOR: " + posMaior);

        sc.close();
    }
}
