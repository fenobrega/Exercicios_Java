package com.dio.exercicios.java;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner notaZeroDez = new Scanner(System.in);

        int nota;
        System.out.println("Insira nota: ");
        nota = notaZeroDez.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida, digite novamente!");
            nota = notaZeroDez.nextInt();
        }
    }
}
