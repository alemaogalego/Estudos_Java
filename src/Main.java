public class Main{

    public static void main(String[] args) {
        // Exercício 1: Calculando a média de dois números
        double soma1 = 5;
        double soma2 = 10;
        double media = (soma1 + soma2) / 2.0;
        System.out.println("A média é: " + media);

        // Exercício 2: Convertendo um valor de double para int
        double valor1 = 15.5;
        int recebe = (int) valor1; // Convertendo double para int
        System.out.println("Valor convertido para int: " + recebe);

        // Exercício 3: Concatenando um char e uma String
        char nome1 = 'L';
        String nome2 = "ucas";
        String nomeCompleto = nome1 + nome2; // Concatenando char e String
        System.out.println("Nome completo: " + nomeCompleto);

        // Exercício 4: Calculando o valor total de uma compra
        double precoProduto = 99.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade; // Calculando o valor total
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);

        // Exercício 5: Convertendo um valor de dólares para reais
        double valorEmDolares = 4.94;
        double valorEmReais = valorEmDolares * 5.0; // Convertendo dólares para reais
        System.out.printf("Valor em reais: R$ %.2f%n", valorEmReais);

        // Exercício 6: Calculando o preço com desconto
        double precoOriginal = 150.0;
        double desconto = 0.20; // 20% de desconto
        double precoComDesconto = precoOriginal * (1 - desconto); // Calculando o preço com desconto
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);



    }
}
