package com.dio.exercicios.java;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class ExNomeIdade {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        String nome;
        int idade;

        while (true){

            System.out.println("Nome do aluno: ");
            nome = ex.next();
            if (nome.equals("0")) {
                System.out.println("Valor zero '0' inserido, programa finalizado!");
                break;
            }

            System.out.println("Idade do aluno: ");
            idade = ex.nextInt();
            System.out.println("Insira outro nome e idade do aluno...");

        }
    }
}

