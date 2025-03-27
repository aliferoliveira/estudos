package br.com.testes;

public class Aula07ForeachExercicio01 {
    /* Soma de Elementos:
       Escreva um programa em Java que utilize um loop forEach para percorrer
       uma lista de números inteiros e calcular a soma de todos os elementos. */

    public static void main(String[] args) {

        int[] numeros = {19, 11, 20, 23, 21};
        int somaDosNumeros = 0;

        for (int num : numeros) {
            somaDosNumeros += num;
        }
        System.out.println("Soma dos números: " + somaDosNumeros);
    }
}
