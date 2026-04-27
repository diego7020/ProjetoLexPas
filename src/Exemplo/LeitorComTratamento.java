package Exemplo;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeitorComTratamento {
    public void lerArquivo(String caminho){

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = br.readLine())!= null){
                System.out.println(linha);
            }

        }
        catch (Exception e){
            System.err.println("Erro ao ler arquivo:" + e.getMessage());
        }

    }
}
