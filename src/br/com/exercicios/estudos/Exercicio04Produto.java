package br.com.exercicios.estudos;

public class Exercicio04Produto {
    // Exercício 4: Calculando o valor total de uma compra

    public static void executar() {
        double precoProduto = 99.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade; // Calculando o valor total
        System.out.println("Exercício 4 - Calculando o valor total de uma compra");
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);
        System.out.println();
    }
}

