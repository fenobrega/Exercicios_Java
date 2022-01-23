package com.dio.exercicios.java;

/*
Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
Altere o programa anterior para mostrar no final a soma dos números.

 */

import java.util.Scanner;

public class IntervaloDosNumeros {
    public static void main(String[] args) {
        Scanner intervalo = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma = 0;

        System.out.println("Primeiro número: ");
        numero1 = intervalo.nextInt();

        System.out.println("Segundo número: ");
        numero2 = intervalo.nextInt();

        for (int count = numero1 + 1; count < numero2; count++) {
            System.out.print(" " + count);
            soma += count;
        }
        System.out.println("\nA soma dos intervalos entre número 1 e número2 são: " + soma);
    }
}