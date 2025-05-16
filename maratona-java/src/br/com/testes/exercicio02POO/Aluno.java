package br.com.testes.exercicio02POO;

public class Aluno {
    public String nome;
    public String curso;
    public double[] notas;

    public void setNotas(double... notas) {
        this.notas = notas;

    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Notas: ");

        for (double nota : this.notas) {
            System.out.println(nota + " ");


            if (nota < 0) {
                System.out.println("Erro, nota inválida!");
            } else if (nota > 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        }
    }

    public void calcularMedia() {
        double soma = 0;
        for (double numeros : notas) {
            soma += numeros;
        }
        double media = soma / notas.length;
        System.out.println("A média é: " + media);
    }
}
