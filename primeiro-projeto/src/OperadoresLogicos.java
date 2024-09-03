public class OperadoresLogicos {
    public static void main(String[] args) {

        String java = "Linguagem de Programação";
        String csharp = "Linguagem de Programação";
        String oracle = "Banco de Dados";
        String mysql = "Banco de Dados";

        if (java == "Linguagem de Programação" && csharp == "Linguagem de Programação") {
            System.out.println("Ambos, são Linguagens de Programação!!");
        }

        if (java == "Linguagem de Programação" || csharp == "Linguagem de Programação") {
            System.out.println("Java e C#, são Linguagens de Programação!!");
        }

        if (java != oracle) {
            System.out.println("Java é Linguagem de Programação e Oracle é banco de dados relacional.");
        }
    }
}
