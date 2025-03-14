package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // condicao: doar se o valor for maior que 5000
        double salario = 6000D;
        // operador ternario é: (condicao) ? verdadeiro :

        String resultado = (salario > 5000 ? "Vou doar 500 para o DevDojo" : "Não tenho condições, mas um dia terei!");
        System.out.println(resultado);
    }

}
