public class EstruturasRepetitivas {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        int contador2 = 0;
        do {
            System.out.println("Contador Do-While " + contador2);
            contador2++;
        } while (contador2<3);

        for (int i = 0; i < 3; i++) {
            System.out.println("For " + i);
        }

    }
}
