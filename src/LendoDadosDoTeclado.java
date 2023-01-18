import java.util.Scanner;

public class LendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner dados = new Scanner (System.in);

        System.out.println("Qual é sua data de nascimento");
        double data = dados.nextDouble();
        System.out.println("Sua data de nascimento é: " + data);

        System.out.println("Qual é seu CPF");
        Long cpf = dados.nextLong();
        System.out.println("Seu CPF é: " + cpf);



    }
}
