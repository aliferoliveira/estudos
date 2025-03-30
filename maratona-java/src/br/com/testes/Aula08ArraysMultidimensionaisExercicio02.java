package br.com.testes;

public class Aula08ArraysMultidimensionaisExercicio02 {
    // Crie uma matriz 3×3 com valores fixos e calcule a soma de todos os seus elementos.
    // Exiba o resultado no console.

    public static void main(String[] args) {

        int soma = 0;
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
    }
}
