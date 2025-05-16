package br.com.testes.exercicios01;
import java.util.Scanner;

public class ContaBancaria {

    private String titular;
    private double saldo = 0;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Erro, valor inexistente");
        }


    }
    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado no valor de: " + valor);
        }
        else {
            System.out.println("Erro, valor inexistente!");
        }
    }

    public void mostrarSaldo (){
        System.out.println("O saldo atual é de: " +this.saldo);
    }

    public void setSaldoInicial (double valor){
        this.saldo += valor;
    }

    public void boasVindas (String nome){
        this.titular = nome;
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá seja bem vindo aos testes na sua conta bancária virtual, digite o seu nome: " );
        String titularConta = scanner.nextLine();
        contaBancaria.boasVindas(titularConta);

        contaBancaria.mostrarSaldo();

        System.out.println("Defina um valor como inicial na conta: ");
        double valorInicial = scanner.nextDouble();
        contaBancaria.setSaldoInicial(valorInicial);

        System.out.println("Digite o valor que você deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        contaBancaria.sacar(valorSaque);

        System.out.println("Digite o valor de depósito: ");
        double valorDeposito = scanner.nextDouble();
        contaBancaria.depositar(valorDeposito);
        contaBancaria.mostrarSaldo();

        scanner.close();

    }

}





