package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário um número inteiro e verifique se ele é um número primo.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio051_VerificaNumeroPrimo {

    public static boolean verificarSeNumeroEPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro para verificar se é primo: ");
            int numeroUsuario = scanner.nextInt();

            if (verificarSeNumeroEPrimo(numeroUsuario)) {
                System.out.println(numeroUsuario + " é um número primo.");
            } else {
                System.out.println(numeroUsuario + " não é um número primo.");
            }
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
