package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário um número inteiro e verifique se ele é par ou ímpar, e se é positivo, negativo ou zero.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio056_ParidadePositividade {

    public static String verificarParidade(int numero) {
        return (numero % 2 == 0) ? "par" : "ímpar";
    }

    public static String verificarPositividade(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "zero";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numeroUsuario = scanner.nextInt();

            String resultadoParidade = verificarParidade(numeroUsuario);
            String resultadoPositividade = verificarPositividade(numeroUsuario);

            System.out.println("O número " + numeroUsuario + " é " + resultadoParidade + " e " + resultadoPositividade + ".");
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
