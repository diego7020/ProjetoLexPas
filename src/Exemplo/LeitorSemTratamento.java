package Exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorSemTratamento {

    public void lerArquivo(String caminho) throws IOException{
        BufferedReader br = 
            new BufferedReader(new FileReader(caminho));
        String linha = "";
        while((linha = br.readLine()) != null){
            System.out.println(linha);
        }
        br.close();        
    }    
}
