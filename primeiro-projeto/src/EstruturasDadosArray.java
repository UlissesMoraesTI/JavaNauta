import java.util.Arrays;

public class EstruturasDadosArray {

    public static void main(String[] args) {

        //Formatando com dados Fixos
        //Ano de Lançamento das verões JAVA
        //Java  8 (LTS): Lançado em março    de 2014.
        //Java 11 (LTS): Lançado em setembro de 2018.
        //Java 17 (LTS): Lançado em setembro de 2021.
        //Java 21 (LTS): Lançado em setembro de 2023.

        int[] anoLancamento = {2014, 2018, 2021, 2023};

        System.out.println();
        System.out.println("Java  8 (LTS): Lançado em março    de " + anoLancamento[0]);
        System.out.println("Java 11 (LTS): Lançado em setembro de " + anoLancamento[1]);
        System.out.println("Java 17 (LTS): Lançado em setembro de " + anoLancamento[2]);
        System.out.println("Java 21 (LTS): Lançado em setembro de " + anoLancamento[3]);

        //ForEach
        for (int ano : anoLancamento) {
            System.out.println(ano);
        }

        //Array com estrutura de repetição
        String[] estruturaRepeticao = {"While", "Do-While", "For"};
        System.out.println("Estrutura de Repetição 1 = " + estruturaRepeticao[0]);
        System.out.println("Estrutura de Repetição 2 = " + estruturaRepeticao[1]);
        System.out.println("Estrutura de Repetição 3 = " + estruturaRepeticao[2]);

        //ForEach
        for (String loop : estruturaRepeticao) {
            System.out.println(loop);
        }

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //ForEach
        for (int numero : numeros) {
            System.out.println(numero);
        }

        double[] salarioSJava = new double[3];
        salarioSJava[0] = 2600;
        salarioSJava[1] = 4000;
        salarioSJava[2] = 7000;

        //ForEach
        for (double salario : salarioSJava) {
            System.out.println(salario);
        }

    }
}
