package com.dio.exercicios.java;

/*
Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';
*/

import java.util.Scanner;

public class ValidaInformacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.print("Nome: ");
        nome = scan.next();

        if (nome.length() <= 3) {
            System.out.println("Nome não pode ser menor que 3 caracter");
        }

        System.out.print("Idade: ");
        idade = scan.nextInt();

        if (idade < 0 | idade > 150) {
            System.out.println("Idade inválida!");
        }

        System.out.print("Estado Civil (s,c,v,d): ");
        estadoCivil = scan.next();

        switch (estadoCivil) {
            case "s":
                break;
            case "c":
                break;
            case "v":
                break;
            case "d":
                break;
            default:
                System.out.println("Digitar 's' para solteiro, 'c' para casado, 'v' para viúvo e 'd' para divorciado");
                break;
        }

        System.out.print("Sexo (m,f): ");
        sexo = scan.next();

        switch (sexo) {
            case "m":
                break;
            case "f":
                break;
            default:
                System.out.println("Digitar 'm' para masculino e 'f' para feminino");
                break;
        }

        System.out.print("Salário: ");
        salario = scan.nextDouble();

        if (salario <= 0) {
            System.out.println("Salário deve ser maio que zero '0'");
        }
    }
}
