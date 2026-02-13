package br.com.exercicios.estudos;

public class Exercicio21Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }

    public static void executar() {
        Exercicio21Produto produto = new Exercicio21Produto();
        produto.setNome("Notebook");
        produto.setPreco(2500.0);

        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço original: R$ %.2f%n", produto.getPreco());

        double percentualDesconto = 10.0; // 10% de desconto
        produto.aplicarDesconto(percentualDesconto);

        System.out.printf("Preço com desconto de %.2f%%: R$ %.2f%n", percentualDesconto, produto.getPreco());
    }
}
