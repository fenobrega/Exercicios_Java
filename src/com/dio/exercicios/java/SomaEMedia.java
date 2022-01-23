package com.dio.exercicios.java;

//Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner somaMedia = new Scanner(System.in);

        int numero;
        int soma = 0;

        for (int count = 0; count < 5; count++) {
            System.out.println("Número: ");
            numero = somaMedia.nextInt();
            soma += numero;
        }

        System.out.println("Soma dos números é " + soma + " e a média é " + (soma / 5));
    }
}
