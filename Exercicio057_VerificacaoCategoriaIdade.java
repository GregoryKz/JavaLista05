package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário sua idade e exiba a categoria correspondente (Criança, Adolescente, Adulto, Idoso).
 * Inclui validação para entradas inválidas e mensagens claras.
 * Feito por Klaus
 */
import java.util.Scanner;

public class Exercicio057_VerificacaoCategoriaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade (em anos): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            scanner.close();
            return;
        }

        int idadeUsuario = scanner.nextInt();

        if (idadeUsuario < 0) {
            System.out.println("Idade inválida! Não pode ser negativa.");
        } else if (idadeUsuario <= 12) {
            System.out.println("Categoria: Criança");
        } else if (idadeUsuario <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idadeUsuario <= 59) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Idoso");
        }

        scanner.close();
    }
}
