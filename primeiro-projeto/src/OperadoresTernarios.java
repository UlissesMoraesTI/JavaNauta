public class OperadoresTernarios {

    public static void main(String[] args) {

        Double dinheiro = 100.00;

        String formaDePagamento = (dinheiro > 0) ? "Pagar Com Dinheiro" : "Pagar com Cartão de Crédito";
        System.out.println(formaDePagamento);
    }
}
