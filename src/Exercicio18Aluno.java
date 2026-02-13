import java.util.Scanner;

public class Exercicio18Aluno {

    String nome;
    int idade;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    static void executar() {
        Scanner scanner = new Scanner(System.in);
        Exercicio18Aluno aluno = new Exercicio18Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        aluno.idade = scanner.nextInt();

        System.out.println("\nDados do Aluno:");
        aluno.exibirDados();
    }

    }
