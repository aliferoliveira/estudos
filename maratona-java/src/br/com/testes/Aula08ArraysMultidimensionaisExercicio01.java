package br.com.testes;

public class Aula08ArraysMultidimensionaisExercicio01 {

    //Crie um programa que declare uma matriz 2×2 com valores pré-definidos e a imprima no
    //console no formato de matriz.

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {3, 4}};

        for (int[] arrayBase : matriz) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

