import java.util.Scanner;

public class Exercicio15Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = scanner.nextInt();

        Double resultado = null;
        switch (operacao) {
            case 1 -> resultado = num1 + num2;
            case 2 -> resultado = num1 - num2;
            case 3 -> resultado = num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                }
            }
            default -> System.out.println("Operação inválida!");
        }

        if (resultado != null) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}