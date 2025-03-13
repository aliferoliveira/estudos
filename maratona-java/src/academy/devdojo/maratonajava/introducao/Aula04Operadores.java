package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);

        int resto = 21 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezIgualADez = 10 == 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);
        System.out.println("isDezIgualADez "+isDezIgualADez);

        // && (AND) || (OR) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalDaContaCorrente = 200D;
        double valorTotalDaContaPoupanca = 10000D;
        float valorPlaystation = 5000;
        boolean isPlaystationCompravel = valorTotalDaContaCorrente >= valorPlaystation || valorTotalDaContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCompravel " +isPlaystationCompravel);

        // ATRIBUIÇÃO

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // CONTADOR

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);


    }
}
