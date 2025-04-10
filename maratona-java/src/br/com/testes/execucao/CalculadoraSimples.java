package br.com.testes.execucao;

public class CalculadoraSimples {
    public void somar(int num1, int num2) {
        System.out.println("A soma dos dois números é: " + (num1 + num2));
    }

    public void subtrair(int num3, int num4) {
        System.out.println("A subtração dos dois números é: " + (num3 - num4));
    }

    public void dividir(int num5, int num6) {
        if (num6 == 0) {
            System.out.println("Não é possível dividir um número por zero");
        } else {
            System.out.println("A divisão dos dois números é: " + num5 / num6);
        }
    }

    public void multiplicar(int num7, int num8) {
        System.out.println("A multiplicação dos dois números é: " + num7 * num8);
    }
}
