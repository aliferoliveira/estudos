package br.com.testes.exercicios01;

import java.util.Scanner;

public class ImpressoraDeNomes {

    public double calcularMedia(double... notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;

        }
        return notas.length > 0 ? soma / notas.length : 0;

    }

    public static void main(String[] args) {
        ImpressoraDeNomes imprime = new ImpressoraDeNomes();
        System.out.println("Média: " + imprime.calcularMedia(4.0, 3.0, 5.0));
        System.out.println("Média: " + imprime.calcularMedia(2.0, 1.0, 1.0));
        System.out.println("Média: " + imprime.calcularMedia(5.0));
    }
}