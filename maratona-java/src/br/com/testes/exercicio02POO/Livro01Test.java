package br.com.testes.exercicio02POO;

import br.com.testes.execucao.Livro;

public class Livro01Test {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = "Luciano";
        livro1.titulo = "A canhota mágica";
        livro1.anoPublicacao = 2025;
        livro1.exibirDetalhes();

        Livro livro2 = new Livro();
        livro2.autor = "Thaciano";
        livro2.titulo = "O polivalente";
        livro2.anoPublicacao = 2023;
        livro2.exibirDetalhes();

        Livro livro3 = new Livro();
        livro3.autor = "Lucho";
        livro3.titulo = "O nove nato";
        livro3.anoPublicacao = 2024;
        livro3.exibirDetalhes();

    }
}
