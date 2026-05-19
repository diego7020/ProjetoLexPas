package Mecanismo;

import Dominio.Token;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Processamento{

    private ArrayList<Token> tabelaSimbolosPrograma;
    
    public Processamento(){

    }

    public void prepararTabelaSimboloPrograma(){
         LeitorDeArquivo leitor = new LeitorDeArquivo();
        //String caminho = "C:\\Temp\\exemplo.txt";
        String caminho = "/home/diego/Estudos/arquivo.txt";
        leitor.carregarArquivoParaLeitor(caminho);
        leitor.importarArquivoParaLeitor();

        BufferedReader br = leitor.getLeitor();
        BufferPrimario bfp = new BufferPrimario(br);
        bfp.processarArquivoNoBufferPrimario();
        bfp.imprimirConteudoDoBufferPrimario(true);

        ArrayList<String> bufferPrimario = bfp.getBufferPrimario();
        BufferSecundario bfs = new BufferSecundario(bufferPrimario);
        bfs.ProcessarBufferSecundario();
        bfs.imprimirConteudoBufferSecundario(true);

        this.tabelaSimbolosPrograma = bfs.getBufferSecundario();
    }

    public void imprimirTabelaSimbolosPrograma(){

        System.out.println("###############################################");
        System.out.println("##### TABELA DE SIMBOLOS DO PROGRAMA #####");
        System.out.printf("%-30s|%-15s\n","lexema","tipo identificado");
        System.out.println("###############################################");
        for(Token token : this.tabelaSimbolosPrograma){
            System.out.printf("%-30s|%-15s\n", token.getLexema(), token.getTipo());
        }

    }
}