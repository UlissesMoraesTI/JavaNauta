package associacaoagregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chamador {
    public static void main(String[] args) {

        Funcionarios marcelo = new Funcionarios("Marcelo");
        Funcionarios juka = new Funcionarios("Juka");
        Funcionarios marcos = new Funcionarios("Marcos");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(marcelo);
        listaDeFuncionarios.add(juka);
        listaDeFuncionarios.add(marcos);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.listarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.listarFuncionarios();
    }
}
