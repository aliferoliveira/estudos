package br.com.testes.exercicios01;
import  java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] notas = new double[5];

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Insira uma nota: ");
            notas[i] = scanner.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i +1) + ": " +notas[i]);

        }
    }
}
