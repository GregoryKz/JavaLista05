package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário três notas, calcule a média e exiba a classificação (Aprovado, Recuperação, Reprovado).
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio055_MediaClassificacao {

    public static String classificarMedia(double media) {
        if (media >= 70) {
            return "Aprovado";
        } else if (media >= 50) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a primeira nota: ");
            double primeiraNota = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double segundaNota = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double terceiraNota = scanner.nextDouble();

            if (primeiraNota < 0 || primeiraNota > 100 || segundaNota < 0 || segundaNota > 100 || terceiraNota < 0 || terceiraNota > 100) {
                System.out.println("Erro: as notas devem estar entre 0 e 100.");
                return;
            }

            double mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3;
            String classificacaoFinal = classificarMedia(mediaNotas);

            System.out.printf("Média: %.2f - %s%n", mediaNotas, classificacaoFinal);
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
