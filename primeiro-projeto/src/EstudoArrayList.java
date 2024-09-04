import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {

        List<String> listaCompras = new ArrayList<>();
        listaCompras.add("Arroz");
        listaCompras.add("Feijão");
        listaCompras.add("Macarrão");
        listaCompras.add(1, "Café");
        listaCompras.add(2, "Detergente");

        for (String item : listaCompras) {
            System.out.println(item);
        }

        String item = listaCompras.get(1);
        System.out.println(item);

        listaCompras.remove(2);
        listaCompras.remove("Feijão");

        for (String item1 : listaCompras) {
            System.out.println(item1);
        }

        boolean listaVazia = listaCompras.isEmpty();
        System.out.println(listaVazia);
        System.out.println(listaCompras.isEmpty());

        int tamList = listaCompras.size();
        System.out.println(tamList);

        boolean existeItem = listaCompras.contains("Maça");
        System.out.println("Maça? " + existeItem);

        //listaCompras.clear();
        //System.out.println("Lista vazia? " + listaCompras.isEmpty());

        //Aero Function
        System.out.println("Aero Function");
        listaCompras.forEach(produto -> System.out.println(produto));
    }
}
