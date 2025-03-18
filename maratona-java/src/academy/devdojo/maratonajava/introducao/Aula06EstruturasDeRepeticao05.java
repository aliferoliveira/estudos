package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição é que o valor da parcela  >= 1000
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int quantidadeParcela = (int) valorTotal; quantidadeParcela >= 1; quantidadeParcela--) {
            double valorParcela = valorTotal / quantidadeParcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + quantidadeParcela + ": R$" + valorParcela);

        }

    }
}
