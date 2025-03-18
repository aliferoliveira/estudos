package br.com.testes;

public class teste01 {
    public static void main(String[] args) {
        /*
        Qual é o maior número.
        Qual é o menor número.
        Se os três números são iguais.
        */

        int numeroUm = 2;
        int numeroDois = 3;
        int numeroTres = 2;

        // Verificando se todos os números são iguais primeiro
        if (numeroUm == numeroDois && numeroUm == numeroTres) {
            System.out.println("Os números são iguais.");
        } else {
            // Verificando o maior número
            if (numeroUm >= numeroDois && numeroUm >= numeroTres) {
                System.out.println("O número " + numeroUm + " é o maior entre os três.");
            } else if (numeroDois >= numeroUm && numeroDois >= numeroTres) {
                System.out.println("O número " + numeroDois + " é o maior entre os três.");
            } else {
                System.out.println("O número " + numeroTres + " é o maior entre os três.");
            }

            // Verificando o menor número
            if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
                System.out.println("O número " + numeroUm + " é o menor entre os três.");
            } else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
                System.out.println("O número " + numeroDois + " é o menor entre os três.");
            } else {
                System.out.println("O número " + numeroTres + " é o menor entre os três.");
            }
        }
    }
}
