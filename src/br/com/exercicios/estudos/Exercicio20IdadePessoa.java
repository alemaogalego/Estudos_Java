package br.com.exercicios.estudos;

public class Exercicio20IdadePessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void executar() {
        Exercicio20IdadePessoa pessoa = new Exercicio20IdadePessoa();
        pessoa.setNome("Lucas Cesar");
        pessoa.setIdade(30);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
    }
}
