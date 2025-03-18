package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10;
        long numeroGrande = (long) 10000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        String nome = "Alifer Blake";

        System.out.println("A idade é: "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é: "+nome);
    }
}
