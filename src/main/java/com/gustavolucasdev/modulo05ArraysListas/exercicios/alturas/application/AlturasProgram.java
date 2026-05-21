package com.gustavolucasdev.modulo05ArraysListas.exercicios.alturas.application;

import com.gustavolucasdev.modulo05ArraysListas.exercicios.alturas.entities.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class AlturasProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();
        Alturas[] vectAlturas = new Alturas[qtdPessoas];

        for (int i = 0; i < vectAlturas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª primeira pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vectAlturas[i] = new Alturas(name, age, height);
        }

        double sum = 0.0;
        for (int i = 0; i < vectAlturas.length; i++) {
            sum += vectAlturas[i].getHeight();
        }
        double avgAlturas = sum / vectAlturas.length;
        System.out.printf("Altura média: %.2f%n", avgAlturas);

        double qtdMenores = 0;
        for (int i = 0; i < vectAlturas.length; i++) {
            if (vectAlturas[i].getAge() < 16) {
                qtdMenores++;
            }
        }
        double porcentagem = qtdMenores / vectAlturas.length * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < vectAlturas.length; i++) {
            if (vectAlturas[i].getAge() < 16) {
                System.out.println(vectAlturas[i].getName());
            }
        }

        sc.close();
    }
}
