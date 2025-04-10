package br.com.testes.exercicio02POO;

import br.com.testes.execucao.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Jinwoo";
        pessoa1.idade = 24;
        pessoa1.falar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Vegeta";
        pessoa2.idade = 35;
        pessoa2.falar();
    }


}
