package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, por favor insira o seu nome: ");
        String nomeDoTitular = scanner.nextLine();
        funcionario.setNome(nomeDoTitular);

        System.out.println("Insira agora a sua idade: ");
        int idadeDoTitular = scanner.nextInt();
        funcionario.setIdade(idadeDoTitular);

        System.out.println("Por favor, insira os três salários que deseja a média: ");
        double[] salariosFuncionarios = new double[3];

        for (int i = 0; i < salariosFuncionarios.length ; i++) {
            System.out.println("Salário " + (i + 1) + ": ");
            salariosFuncionarios[i] = scanner.nextDouble();

        }

        funcionario.setSalario(salariosFuncionarios);

        funcionario.imprimeDados();
        funcionario.calculo();

        scanner.close();
    }



}