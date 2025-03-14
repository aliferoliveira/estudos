package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        /* se renda for menor que 38097, taxa 9.32%
         se renda for maior ou igual a 38098 e menor que 75517, taxa 36.97%
         se renda for maior ou igual a 75518, taxa 49.50% */

        double renda = 45000;
        double taxa;

        if (renda <= 34.712){
            taxa = 9.70F;
        } else if (renda >= 34.712 && renda <= 68.507) {
            taxa = 37.35;
        }else{
            taxa = 49.50;
        }

        double resultado = renda * (taxa / 100);
        System.out.println(resultado);
    }
}
