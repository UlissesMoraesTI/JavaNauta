package excecaosimverificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\uliss\\OneDrive\\Área de Trabalho\\JavaNAUTA\\ARQENTRADA.TXT"));

            String registro;
            while ((registro = bufferedReader.readLine()) != null) {
                System.out.println(registro);
            }

       } catch (FileNotFoundException e) {
            System.out.println("Problemas na leitura: Arquivo não encontrado." + e.getMessage());
       } catch (IOException e) {
            System.out.println("Problemas na leitura do Arquivo." + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
