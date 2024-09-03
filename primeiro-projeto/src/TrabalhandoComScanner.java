import java.util.Scanner;

public class TrabalhandoComScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Meu nome é: " + nome);

        System.out.println("Digite sua idade: ");
        int  idade = scanner.nextInt();
        System.out.println("Minha idade é: " + idade);

        System.out.println();
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos de idade.");
    }
}
