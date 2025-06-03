package dev_klaus.lista05;

/*
 * Faça um programa que solicite ao usuário seu peso e altura, calcule o Índice de Massa Corporal (IMC) e classifique-o de acordo com a tabela de IMC.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio053_CalculoIMC {

    public static String classificarIMC(double indiceMassaCorporal) {
        if (indiceMassaCorporal < 18.5) {
            return "Abaixo do peso";
        } else if (indiceMassaCorporal < 25) {
            return "Peso normal";
        } else if (indiceMassaCorporal < 30) {
            return "Sobrepeso";
        } else if (indiceMassaCorporal < 35) {
            return "Obesidade grau I";
        } else if (indiceMassaCorporal < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (mórbida)";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu peso em kg: ");
            double pesoUsuario = scanner.nextDouble();

            System.out.print("Digite sua altura em metros: ");
            double alturaUsuario = scanner.nextDouble();

            if (pesoUsuario <= 0 || alturaUsuario <= 0) {
                System.out.println("Erro: peso e altura devem ser maiores que zero.");
                return;
            }

            double indiceMassaCorporal = pesoUsuario / (alturaUsuario * alturaUsuario);
            String classificacaoIMC = classificarIMC(indiceMassaCorporal);

            System.out.printf("Seu IMC é %.2f - %s%n", indiceMassaCorporal, classificacaoIMC);
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
