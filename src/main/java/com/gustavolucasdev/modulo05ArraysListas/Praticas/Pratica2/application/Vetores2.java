package com.gustavolucasdev.modulo05ArraysListas.Praticas.Pratica2.application;

import com.gustavolucasdev.modulo05ArraysListas.Praticas.Pratica2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("informe a quantidade produtos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("|------ Produto " + (i + 1) + " ------|");
            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Valor do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            System.out.println("|-=-=-=-=-=-=-=-=-=-=-=-|");
            System.out.println(" ");
        }
        
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Média de preço: %.2f%n", avg);
        
        sc.close();
    }
}
