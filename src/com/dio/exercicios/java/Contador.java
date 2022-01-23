package com.dio.exercicios.java;

/*
Faça um programa que imprima na tela os números de 1 a 20,
um abaixo do outro. Depois modifique o programa para que ele
mostre os números um ao lado do outro.
*/

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);

        int numero;

        System.out.println("Informe até quanto vai o contador");
        numero = contador.nextInt();
        for (int count = 0; count <= numero; count++) {
            System.out.println(count);
        }
        for (int count = 0; count <= numero; count++) {
            System.out.print(count);
        }
    }
}
