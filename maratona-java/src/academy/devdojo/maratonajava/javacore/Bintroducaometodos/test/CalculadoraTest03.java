package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);

        double result02 = calculadora.divideDoisNumeros02(20, 0);
        System.out.println(result02);

        calculadora.imprimeDoisNumeros(20, 0);
    }
}
