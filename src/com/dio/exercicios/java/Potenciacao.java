package com.dio.exercicios.java;
/*
Faça um programa que peça dois números, base e expoente,
calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */

import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        Scanner potenciacao = new Scanner(System.in);

        int base;
        int potencia;
        int resultado = 1;

        System.out.println("Número 1: ");
        base = potenciacao.nextInt();
        System.out.println("Número 2: ");
        potencia = potenciacao.nextInt();

        for (int count = 0; count < potencia; count++)
            resultado *= base;
            System.out.println(resultado);
    }
}
