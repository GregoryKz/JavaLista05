package dev_klaus.lista05;

/*
 * Faça um programa que solicite os comprimentos dos três lados de um triângulo e classifique-o como equilátero, isósceles ou escaleno.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio052_ClassificaTriangulo {

    public static boolean verificarSeTrianguloEValido(double ladoUm, double ladoDois, double ladoTres) {
        return (ladoUm + ladoDois > ladoTres) &&
                (ladoUm + ladoTres > ladoDois) &&
                (ladoDois + ladoTres > ladoUm);
    }

    public static String classificarTriangulo(double ladoUm, double ladoDois, double ladoTres) {
        if (ladoUm == ladoDois && ladoDois == ladoTres) {
            return "Equilátero";
        } else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o comprimento do lado 1: ");
            double comprimentoLadoUm = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado 2: ");
            double comprimentoLadoDois = scanner.nextDouble();

            System.out.print("Digite o comprimento do lado 3: ");
            double comprimentoLadoTres = scanner.nextDouble();

            if (comprimentoLadoUm <= 0 || comprimentoLadoDois <= 0 || comprimentoLadoTres <= 0) {
                System.out.println("Erro: todos os lados devem ser maiores que zero.");
                return;
            }

            if (!verificarSeTrianguloEValido(comprimentoLadoUm, comprimentoLadoDois, comprimentoLadoTres)) {
                System.out.println("Os comprimentos informados não formam um triângulo válido.");
                return;
            }

            String tipoTriangulo = classificarTriangulo(comprimentoLadoUm, comprimentoLadoDois, comprimentoLadoTres);
            System.out.println("O triângulo é do tipo: " + tipoTriangulo);
        } catch (Exception excecao) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
