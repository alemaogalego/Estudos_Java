import java.util.Scanner;

public class Exercicio07Robo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {;

            System.out.println("Exercício 7 - Movimentação de um robô");
            System.out.print("Digite a direção (N, S, L, O): ");
            String direcao = scanner.nextLine().toUpperCase();

            System.out.print("Digite a quantidade de passos: ");
            int passos = scanner.nextInt();

            String resultado = moverRobo(direcao, passos);
            System.out.println(resultado);
        }

    }

    private static String moverRobo(String direcao, int passos) {

        switch (direcao) {
            case "N":
                return "O robô se moveu " + passos + " passos para o Norte.";
            case "S":
                return "O robô se moveu " + passos + " passos para o Sul.";
            case "L":
                return "O robô se moveu " + passos + " passos para a Leste.";
            case "O":
                return "O robô se moveu " + passos + " passos para a Oeste.";
            default:
                return "Direção inválida. Use N, S, L ou O.";
        }
    }
}