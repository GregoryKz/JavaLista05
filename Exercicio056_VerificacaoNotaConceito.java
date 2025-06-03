package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário uma nota de 0 a 100 e exiba o conceito correspondente (A, B, C, D, F).
 * Feito por Klaus
 */
import java.util.Scanner;

public class Exercicio056_VerificacaoNotaConceito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 100: ");
        int notaDigitada = scanner.nextInt();

        if (notaDigitada < 0 || notaDigitada > 100) {
            System.out.println("Nota inválida! Deve ser entre 0 e 100.");
        } else {
            char conceito;
            if (notaDigitada >= 90) {
                conceito = 'A';
            } else if (notaDigitada >= 80) {
                conceito = 'B';
            } else if (notaDigitada >= 70) {
                conceito = 'C';
            } else if (notaDigitada >= 60) {
                conceito = 'D';
            } else {
                conceito = 'F';
            }

            System.out.println("Conceito: " + conceito);
        }

        scanner.close();
    }
}
