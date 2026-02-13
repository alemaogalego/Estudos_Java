package br.com.exercicios.estudos;

import java.util.Scanner;

public class Exercicio13Fatorial {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = leitor.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
            return;
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    static void main() {
        executar();
    }
}
