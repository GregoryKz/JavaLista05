package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário um número inteiro e verifique se ele é positivo, negativo ou zero.
 * Utiliza switch expression para classificação sem if e else.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio058_VerificacaoSinalNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite um número inteiro: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Erro: Entrada inválida! Você deve digitar um número inteiro.");
            scanner.close();
            return;
        }

        int numeroDigitado = scanner.nextInt();

        String resultado = switch (Integer.signum(numeroDigitado)) {
            case 1 -> "O número " + numeroDigitado + " é positivo.";
            case -1 -> "O número " + numeroDigitado + " é negativo.";
            default -> "O número digitado é zero.";
        };

        System.out.println(resultado);

        scanner.close();
    }
}
