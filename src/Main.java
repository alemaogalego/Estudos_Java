import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {;
            List<Runnable> exercicios = Arrays.asList(
                    Exercicio01Media::executar,
                    Exercicio02Casting::executar,
                    Exercicio03Texto::executar,
                    Exercicio04Produto::executar,
                    Exercicio05Moeda::executar,
                    Exercicio06Desconto::executar,
                    Exercicio07Robo::executar
            );
            while (true) {
                System.out.println("\n=== MENU DE EXERCÍCIOS ===");
                for (int i = 0; i < exercicios.size(); i++) {
                    System.out.println((i + 1) + " - Exercício " + (i + 1));
                }
                System.out.println("0 - Sair");
                System.out.print("\nEscolha uma opção: ");

                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    System.out.println("Saindo... Até logo!");
                    break;
                }

                if (escolha > 0 && escolha <= exercicios.size()) {
                    System.out.println("\n--- Executando " + (escolha) + " ---");
                    // Pega o exercício da lista pelo índice (escolha - 1) e roda!
                    exercicios.get(escolha - 1).run();
                    System.out.println("\n-----------------------");
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}