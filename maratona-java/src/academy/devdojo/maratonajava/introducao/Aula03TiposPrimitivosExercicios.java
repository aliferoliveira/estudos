package academy.devdojo.maratonajava.introducao;

/*
Texto do exercício:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Alifer";
        String endereco = "Rua Albuquerque 33";
        double salario = 1518.33D;
        String dataRecebimentoSalario = "11/03/2025";

        System.out.println("Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salário de "+salario+ " na data "+dataRecebimentoSalario);
    }
}
