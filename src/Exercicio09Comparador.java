import java.util.Scanner;

public class Exercicio09Comparador {
    // Padronizado com os outros exercícios (Main chama ::executar)
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        // Para tipos primitivos (int, double, boolean...), a comparação é com ==
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro.");
        }
    }
}
