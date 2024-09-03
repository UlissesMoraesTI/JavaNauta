public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome1 = "Pedro Luiz";
        String nome2 = "Mario Penha";

        int tamanhoNome = nome1.length();
        System.out.println(tamanhoNome);

        System.out.println(nome1.toUpperCase());
        System.out.println(nome1.toLowerCase());

        boolean confere = nome1.equalsIgnoreCase(nome2);
        System.out.println(confere);
    }
}
