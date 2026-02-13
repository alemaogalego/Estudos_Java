package br.com.exercicios.estudos;

import java.util.Scanner;

public class Exercicio12ParImpar {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
