package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário um ano e verifique se ele é bissexto.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio054_VerificaAnoBissexto {

    public static boolean verificarSeAnoEValido(int ano) {
        return ano > 0;
    }

    public static boolean verificarSeAnoEValidoBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um ano para verificar se é bissexto: ");
            int anoUsuario = scanner.nextInt();

            if (!verificarSeAnoEValido(anoUsuario)) {
                System.out.println("Erro: o ano deve ser um valor positivo.");
                return;
            }

            if (verificarSeAnoEValidoBissexto(anoUsuario)) {
                System.out.println("O ano " + anoUsuario + " é bissexto.");
            } else {
                System.out.println("O ano " + anoUsuario + " não é bissexto.");
            }
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
