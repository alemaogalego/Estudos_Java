package br.com.exercicios.estudos;

import java.util.Scanner;

public class Exercicio23Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio23Livro livro = new Exercicio23Livro();

        System.out.println("nome do livro: ");
        livro.setTitulo(scanner.nextLine());

        System.out.println("autor do livro: ");
        livro.setAutor(scanner.nextLine());

        System.out.println("Exercício 23 - Criando uma classe Livro");
        livro.exibirInformacoes();
    }
}
