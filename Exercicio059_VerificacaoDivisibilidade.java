package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário um número e verifique se ele é divisível por 3 e por 5.
 * Sem uso explícito de if/else, utilizando operador ternário e lógica booleana.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio059_VerificacaoDivisibilidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        boolean entradaValida = scanner.hasNextInt();
        int numeroDigitado = entradaValida ? scanner.nextInt() : 0;

        String resultado = !entradaValida ?
                "Erro: Entrada inválida! Por favor, digite um número inteiro." :
                (numeroDigitado % 3 == 0 && numeroDigitado % 5 == 0) ?
                        "O número " + numeroDigitado + " é divisível por 3 e por 5." :
                        "O número " + numeroDigitado + " NÃO é divisível por 3 e por 5.";

        System.out.println(resultado);
        scanner.close();
    }
}
