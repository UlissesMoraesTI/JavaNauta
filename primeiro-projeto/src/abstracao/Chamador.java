package abstracao;

public class Chamador {
    public static void main(String[] args) {
        Funcionario nene = new Funcionario();
        nene.setRua("Caldas Aulete");
        nene.setCidade("Campo Grande");
        nene.setNumero("635");
        nene.setEstado("MS");
        nene.setCep("79052-210");
        nene.setNome("Nene Da Silva Sauro");
        nene.setDocumento("21622921");
        nene.setCargo("Programador");

        Cliente nenhum = new Cliente("Caldas Aulete", "79052-210", "MS", "Campo Grande", "Nenhum Da Silva Pereira", "21622922");

        System.out.println(nene);
        nene.mostrarEndereco();

        System.out.println(nenhum);
        nenhum.mostrarEndereco();
    }
}
