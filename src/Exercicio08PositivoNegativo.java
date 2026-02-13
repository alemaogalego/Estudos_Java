import java.util.Scanner;

public class Exercicio08PositivoNegativo {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 8 - Verificar se um número é positivo, negativo ou zero");
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

    }
}
