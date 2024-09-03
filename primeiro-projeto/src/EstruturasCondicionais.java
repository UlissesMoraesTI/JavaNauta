public class EstruturasCondicionais {

    public static void main(String[] args) {

         int faixaEtaria = 60;

         if (faixaEtaria <= 12) {
             System.out.println("Criança");
         } else if (faixaEtaria >=13 && faixaEtaria <=18 ) {
             System.out.println("Adolecente");
         } else if (faixaEtaria >=19 && faixaEtaria <= 59) {
             System.out.println("Adulto");
         } else if (faixaEtaria >=60) {
             System.out.println("Idoso");
         }
    }
}
