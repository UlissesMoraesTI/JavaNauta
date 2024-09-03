public class ConversaoTipos {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("#--- Integer -----------------#");

        //Conversão Integer para Long
        int numeroInteiro11 = 11;
        long iL = numeroInteiro11;
        System.out.println("Integer p/Long = " + iL);

        //Conversão Integer para Double
        int numeroInteiro12 = 12;
        double iD = numeroInteiro12;
        System.out.println("Integer p/Double = " + iD);

        //Conversão Integer para String
        Integer numeroInteiro13 = 13;
        String iS = numeroInteiro13.toString();
        System.out.println("Integer p/String = " + iS);

        System.out.println();
        System.out.println("#--- Long -----------------#");

        //Conversão Long para Integer
        Long numeroLong21 = 21L;
        int lI = numeroLong21.intValue();
        System.out.println("Long p/ Integer = " + lI);

        //Conversão Long para Double
        long numeroLong22 = 22L;
        double lD = numeroLong22;
        System.out.println("Long p/Double = " + lD);

        //Conversão Long para String
        Long numeroLong23 = 23L;
        String lS = numeroLong23.toString();
        System.out.println("Long p/String = " + lS);

        System.out.println();
        System.out.println("#--- Double -----------------#");

        //Conversão Double para Inteiro
        double valorDouble31 = 31.31;
        int valorInteiro31 = (int) valorDouble31;
        System.out.println("Double p/Integer = " + valorInteiro31);

        //Conversão Double para Long
        double valorDouble32 = 32.32;
        long valorLong32 = (long) valorDouble32;
        System.out.println("Double p/Long = " + valorLong32);

        //Conversão Double para String
        Double valorDouble33 = 33.33;
        String dS = valorDouble33.toString();
        System.out.println("Double p/String = " + dS);

        System.out.println();
        System.out.println("#--- String -----------------#");

        //Conversão String para Inteiro - Sem casas Decimais
        String numeroAlfa41 = " 41";
        Integer numeroInteiro41 = Integer.parseInt(numeroAlfa41.trim());
        System.out.println("Alfa Para Inteiro = " + numeroInteiro41);

        //Conversão String para Long - Sem casas Decimais
        String numeroAlfa42 = " 42";
        Long numeroLong42 = Long.parseLong(numeroAlfa42.trim());
        System.out.println("Alfa Para Inteiro = " + numeroLong42);

        //Conversão String para Double - Com casas Decimais
        String valorAlfa43 = "43.43";
        Double valorMonetario43 = Double.parseDouble(valorAlfa43.trim());
        System.out.println("Alfa Para Double = " + valorMonetario43);

        System.out.println();
        System.out.println("#--- Fim -----------------#");
    }
}
