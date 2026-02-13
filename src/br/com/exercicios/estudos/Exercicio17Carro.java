package br.com.exercicios.estudos;

public class Exercicio17Carro {

    String modelo;
    int ano;
    String cor;

    int anoAtual = 2026;

    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void calcularIdade() {
        int idade = anoAtual - ano;
        System.out.println("Idade do carro: " + idade + " anos");
    }

    public static void executar() {
        Exercicio17Carro carro = new Exercicio17Carro();
        carro.modelo = "Toyota Corolla";
        carro.ano = 2015;
        carro.cor = "Prata";

        System.out.println("=== Ficha Técnica do Carro ===");
        carro.exibirFichaTecnica();

        System.out.println("\n=== Cálculo da Idade do Carro ===");
        carro.calcularIdade();
    }
}


