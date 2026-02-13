import java.util.Scanner;

public class Exercicio14Pessoa {
    static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("O nome da pessoa é: " + nome);
    }

    static void main() {
        executar();
    }
}
