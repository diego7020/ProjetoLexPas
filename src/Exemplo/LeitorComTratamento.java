package Exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorComTratamento {
    
    public void lerArquivo(String caminho){
        try(BufferedReader br 
            = new BufferedReader(new FileReader(caminho))){
            String linha = "";
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch(IOException ex){
            System.err.println("Erro ao ler o arquivo: " + ex.getMessage());
        }
    }
}
