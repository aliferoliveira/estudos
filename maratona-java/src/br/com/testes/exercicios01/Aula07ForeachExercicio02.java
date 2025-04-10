package br.com.testes.exercicios01;

public class Aula07ForeachExercicio02 {
    // Contagem de Palavras:
    //Crie um programa que tenha uma lista de palavras e
    // use um loop forEach para contar quantas palavras possuem mais de cinco letras.

    public static void main(String[] args) {
        String [] palavras = {"Felicidade", "Alegria", "Bobo", "Medo"};
        int quantidadeDeLetras = 0;

        for (String num : palavras){
            if (num.length() > 5){
                quantidadeDeLetras++;
            }
        }
        System.out.println("A quantidade de palavras com mais de cinco letras é: "+quantidadeDeLetras);

    }
}
