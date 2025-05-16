package br.com.testes.exercicio02POO;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Alifer";
        aluno.curso = "ADS";
        aluno.setNotas(4,9.5,0, -3);
        aluno.mostrarDados();
        System.out.println("---------------------------");
        aluno.calcularMedia();
    }
}
