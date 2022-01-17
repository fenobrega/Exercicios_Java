package com.dio.exercicios.java;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int numero;
        int count = 0;
        int numPar = 0;
        int numImpar = 0;

        System.out.println("Quantidade de número:");
        quantidadeNumero = scan.nextInt();

        while (count < quantidadeNumero) {
            System.out.println("Informe o número:");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }

            count++;

        }

        System.out.println("Quantidade de números pares são: " + numPar);
        System.out.println("Quantidade de números ímpares são: " + numImpar);
        System.out.println("Segue o aprendizado...");

    }

}
