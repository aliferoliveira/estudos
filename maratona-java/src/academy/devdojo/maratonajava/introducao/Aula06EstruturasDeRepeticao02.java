package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares até 1000000

        /* for (int i = 0 ; i <= 1000000; i += 2){
            System.out.println("For "+i);
            */

        for (int i = 3; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("For " + i);
            }
        }
    }
}
