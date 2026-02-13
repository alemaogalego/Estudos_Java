import java.util.Scanner;

public class Exercicio11Tabuada {
    static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = leitor.nextInt();

        int i;
        for(i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
