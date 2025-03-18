package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for


        int count = 13;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }

        // do while

        do {
            System.out.println(count);
            count += 1;
        } while (count <= 12);

        // for

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+i);
        }


    }
}
