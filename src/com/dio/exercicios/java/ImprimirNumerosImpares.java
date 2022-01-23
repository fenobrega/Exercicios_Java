package com.dio.exercicios.java;

//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

import java.util.Scanner;

public class ImprimirNumerosImpares {
    public static void main(String[] args) {
        Scanner numeroImpar = new Scanner(System.in);

        int numero = 0;
        while (numero < 50) {
            if (numero % 2 != 0) {
                System.out.println("Números ímpares de 0 a 50: " + numero);
            }
            numero++;
        }
    }
}
