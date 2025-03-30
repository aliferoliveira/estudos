package br.com.testes;

public class Aula08ArraysMultidimensionaisExercicio03 {
    //Crie uma matriz 4×4 preenchida com números aleatórios entre 1 e 100.
    // Em seguida, percorra a matriz e exiba o maior número encontrado.

    // 12 98 65 44

    //43 34 11 55

    //22 25 89 63

    //56 78 32 77

    public static void main(String[] args) {
        int[][] matriz = {
                {12, 98, 65, 44},
                {43, 34, 11, 55},
                {22, 25, 89, 63},
                {56, 78, 32, 77}};

        int maiorNumero = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorNumero){
                    maiorNumero = matriz[i][j];
                }
            }
        }
        System.out.println(maiorNumero);
    }


}
