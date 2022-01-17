package com.dio.exercicios.java;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int media = 0;
        int maiorNumero = 0;

        for (int c = 0; c < 5; c++) {
            System.out.println("teste");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        media = soma/5;

        System.out.println("Soma das notas: " + soma);
        System.out.println("A média é: " + media);
        System.out.println("Maior número é: " + maiorNumero);
    }
}
/*
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
*/