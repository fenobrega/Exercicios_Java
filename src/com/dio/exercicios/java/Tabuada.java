package com.dio.exercicios.java;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int resultado = 0;

        System.out.print("Tabuada do: ");
        tabuada = scan.nextInt();

        System.out.println("\n-- Tabuada --");

        for (int count = 0; count <= 10; count++){
            resultado = tabuada * count;
            System.out.println(tabuada + " x " + count + " = " + resultado);
        }
    }
}
