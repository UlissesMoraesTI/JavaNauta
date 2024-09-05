import java.util.HashMap;
import java.util.LinkedHashMap;

public class EstudoHashMap {
    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Pedro Luiz Ronco", 10.);
        notasAlunos.put("Pedro di Lara", 9.0);
        notasAlunos.put("Ratinho", 8.0);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " nota " + nota);
        }

        double nota = notasAlunos.get("Ratinho");
        System.out.println("A nota do Ratinho é " + nota);

        for (String nome : notasAlunos.keySet()){
            double nota1 = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota1);
        }

        int tamanhoHashMap = notasAlunos.size();
        System.out.println(tamanhoHashMap);

        notasAlunos.remove("Ratinho");

        for (String nome : notasAlunos.keySet()){
            double nota2 = notasAlunos.get(nome);
            System.out.println(nome + " nota " + nota2);
        }

        int tamanhoHashMap2 = notasAlunos.size();
        System.out.println(tamanhoHashMap2);
    }
}
