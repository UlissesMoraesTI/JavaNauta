package associacaoagregacao;

import java.util.List;

public class Departamento {

    private String nome;
    private List<Funcionarios> listaDeFuncionarios;

    public Departamento() {
    }

    public Departamento(String nome, List<Funcionarios> listaDeFuncionarios) {
        this.nome = nome;
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionarios> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<Funcionarios> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", listaDeFuncionarios=" + listaDeFuncionarios +
                '}';
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + nome);
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario));
    }
}
