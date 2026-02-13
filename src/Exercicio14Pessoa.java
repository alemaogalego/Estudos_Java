import java.util.Scanner;

public class Exercicio14Pessoa {
    static void main() {
        String nome = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        nome = scanner.nextLine();

        System.out.println("O nome da pessoa é: " + nome);
    }
}
