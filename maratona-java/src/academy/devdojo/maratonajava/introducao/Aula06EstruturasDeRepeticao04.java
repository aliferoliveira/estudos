package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição é que o valor da parcela  >= 1000
    public static void main(String[] args) {

        int valorTotal = 50000;

        for (int quantidadeParcela = 1; quantidadeParcela <= valorTotal; quantidadeParcela += 1) {
            double valorParcela = valorTotal / quantidadeParcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + quantidadeParcela + ": R$" + valorParcela);

        }

    }
}
