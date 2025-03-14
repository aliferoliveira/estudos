package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        /* Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        Considerando 1 como domingo */

        byte diaUtil = 3;
        switch (diaUtil){
            case 1, 7:
                System.out.println("Fim de semana");
                break;

            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inexistente");


        }

    }
}
