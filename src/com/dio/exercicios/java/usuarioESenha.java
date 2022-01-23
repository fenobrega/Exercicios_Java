package com.dio.exercicios.java;
/*
Faça um programa que leia um nome de usuário e a sua senha
e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.
 */

import java.util.Scanner;

public class usuarioESenha {
    public static void main(String[] args) {
        Scanner usuarioSenha = new Scanner(System.in);

        String nome;
        String senha;
        int count = 0;

        System.out.print("Nome de usuário: ");
        nome = usuarioSenha.next();
        System.out.print("Senha: ");
        senha = usuarioSenha.next();

        while (senha.equals(nome)) {
            System.out.println("Senha inválida!\nSenha deve ser diferente do nome de usuário");
            System.out.print("Nome de usuário: ");
            nome = usuarioSenha.next();
            System.out.print("Senha: ");
            senha = usuarioSenha.next();
            count++;
        }
    }
}
