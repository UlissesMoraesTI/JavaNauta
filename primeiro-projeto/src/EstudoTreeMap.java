import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Pedrinho", 10.0);
        notasAlunos.put("Luizinho", 9.0);
        notasAlunos.put("Fredinho", 8.0);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " nota " + nota);
        }

        //Principais Diferenças
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Ultima chave: " + notasAlunos.lastKey());

    }
}
