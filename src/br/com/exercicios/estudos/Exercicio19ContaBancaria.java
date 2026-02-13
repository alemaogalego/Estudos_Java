package br.com.exercicios.estudos;

public class Exercicio19ContaBancaria {
    private String numeroConta;
    private double saldo;
    public String nomeTitular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void executar() {
        Exercicio19ContaBancaria conta = new Exercicio19ContaBancaria();
        conta.setNumeroConta("12345-6");
        conta.setSaldo(1000.0);
        conta.nomeTitular = "Lucas Cesar";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Nome do Titular: " + conta.nomeTitular);
    }

}
