package excecaonaoverificada;

import java.util.Scanner;

public class ValidaCPF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cpf");
        String verificaCPF = verificarCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificarCPF(String cpf) {

        try {
            if (cpf.equals("12345678901")) {
                throw new RuntimeException("CPF já Cadastrado " + cpf);
            }
            else {
                return "CPF válido, Cadastrado Com Sucesso!";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já Cadastrado " + cpf);
        }
    }
}
