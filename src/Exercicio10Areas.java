import java.util.Scanner;

public class Exercicio10Areas {
    static void executar() {
        int escolha = 0;

        Scanner leitor = new Scanner(System.in);

        while(escolha != 3) {
            System.out.println("Escolha a forma geométrica para calcular a área:");
            System.out.println("1 - Círculo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Sair");
            System.out.println("Digite sua escolha: ");
            escolha = leitor.nextInt();

            if(escolha == 1) {
                System.out.println("Digite o raio do círculo: ");
                double raio = leitor.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
            } else if(escolha == 2) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = Math.pow(lado, 2);
                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if(escolha == 3) {
                System.out.println("Saindo... Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }
}
