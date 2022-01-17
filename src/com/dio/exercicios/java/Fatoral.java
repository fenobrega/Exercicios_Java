package com.dio.exercicios.java;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Fatoral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicar = 1;

        System.out.println("Informe um número: ");
        numero = scan.nextInt();

        System.out.print(numero + " != ");
        for (int count = numero; count >= 1; count--) {
            multiplicar *= count;
        }
        System.out.println(multiplicar);
    }
}
