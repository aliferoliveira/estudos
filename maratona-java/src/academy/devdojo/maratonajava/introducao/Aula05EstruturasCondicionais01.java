package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoAComprarBebidaAlcolica = idade >= 18;

        if (isAutorizadoAComprarBebidaAlcolica == false){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }



         if (!isAutorizadoAComprarBebidaAlcolica){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }


    }
}
