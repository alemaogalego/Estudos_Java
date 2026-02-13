package br.com.exercicios.estudos;

public class Exercicio06Desconto {
    // Exercício 6: Calculando o preço com desconto

    public static void executar() {
        double precoOriginal = 150.0;
        double desconto = 0.20; // 20% de desconto
        double precoComDesconto = precoOriginal * (1 - desconto); // Calculando o preço com desconto
        System.out.println("Exercício 6 - Calculando o preço com desconto");
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);
        System.out.println();
    }
}

