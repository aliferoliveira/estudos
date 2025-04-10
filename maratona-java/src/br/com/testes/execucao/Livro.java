package br.com.testes.execucao;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + "; autor: " +autor+ "; ano de publicação: " +anoPublicacao);
    }
}
