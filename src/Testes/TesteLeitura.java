package Testes;

import Exemplo.LeitorSemTratamento;
import java.io.IOException;

public class TesteLeitura {
    public static void executar(){
        LeitorSemTratamento leitor = new LeitorSemTratamento();    
        try{
        leitor.lerArquivo("/home/diego/Estudos/arquivo.txt");
        } catch (IOException e){
        e.printStackTrace();
        }
    }
}
