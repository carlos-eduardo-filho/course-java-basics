import java.util.Scanner;

public class LendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner dados = new Scanner (System.in);

        System.out.println("Qual é o seu nome");
        String nome = dados.nextLine();
        System.out.println("Sua nome é: " + nome);

        System.out.println("Qual é seu CPF");
        Long cpf = dados.nextLong();
        System.out.println("Seu CPF é: " + cpf);



    }
}
