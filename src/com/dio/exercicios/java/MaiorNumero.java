package com.dio.exercicios.java;
//Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner maiorNumero = new Scanner(System.in);

        int numero;
        int maior = 0;


        for (int count = 0; count < 5; count++) {
            System.out.println("Número: ");
            numero = maiorNumero.nextInt();

            if (numero > maior) {
                maior = numero;
            }

        }
        System.out.println("O maior número foi: " + maior);
    }
}
