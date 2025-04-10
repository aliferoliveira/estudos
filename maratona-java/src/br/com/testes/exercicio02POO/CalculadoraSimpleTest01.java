package br.com.testes.exercicio02POO;

import br.com.testes.execucao.CalculadoraSimples;

public class CalculadoraSimpleTest01 {
    public static void main(String[] args) {
        CalculadoraSimples somar = new CalculadoraSimples();
        somar.somar(10, 20);

        CalculadoraSimples subtrair = new CalculadoraSimples();
        subtrair.subtrair(20, 10);

        CalculadoraSimples dividir = new CalculadoraSimples();
        dividir.dividir(20, 0);

        CalculadoraSimples multiplicar = new CalculadoraSimples();
        multiplicar.multiplicar(10, 2);
    }
}
