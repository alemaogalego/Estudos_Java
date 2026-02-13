package br.com.exercicios.estudos;

public class Exercicio22AlunoNotas {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public static void executar() {
        Exercicio22AlunoNotas aluno = new Exercicio22AlunoNotas();
        aluno.setNome("Lucas Cesar");
        aluno.setNota1(8.5);
        aluno.setNota2(7.0);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());
    }

}
