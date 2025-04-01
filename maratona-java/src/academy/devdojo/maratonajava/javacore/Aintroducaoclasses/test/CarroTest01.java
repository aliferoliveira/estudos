package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2021;

        carro1 = carro2;

        System.out.println("O primeiro carro escolhido foi um: " + carro1.nome + ", " + carro1.modelo + " de " + carro1.ano);
        System.out.println("O segundo carro escolhido foi um: " + carro2.nome + ", " + carro2.modelo + " de " + carro2.ano);
    }
}
