package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 150.23D;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 12;
        String nome = "Alifer Blake";

        System.out.println("A idade é: "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é: "+nome);
    }
}
