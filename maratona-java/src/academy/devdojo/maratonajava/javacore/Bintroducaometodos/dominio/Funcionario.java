package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);


        for (double salarios : salario) {
            System.out.print(salarios + " ");
        }

    }

    public void calculo() {
        if (salario != null && salario.length > 0) {
            for (double valores : salario) {
                soma += valores;

            }
            double media = soma / salario.length;
            System.out.println("\nA média dos últimos três salários: " + media);

        } else {
            System.out.println("Erro! Não há salários");

        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getSoma() {
        return soma;
    }
}
