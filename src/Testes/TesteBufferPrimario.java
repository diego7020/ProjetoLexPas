package Testes;

import java.io.BufferedReader;

import Mecanismo.BufferPrimario;
import Mecanismo.LeitorDeArquivo;

public class TesteBufferPrimario {
    public static void executar(){
        LeitorDeArquivo leitor = new LeitorDeArquivo();
        //String caminho = "C:\\Temp\\exemplo.txt";
        String caminho = "/home/colossus/Documents/GitHub/2026-1-CPL/ProjetoLexPas/LexPas/src/Temp/exemplo.pas";
        leitor.carregarArquivoParaLeitor(caminho);
        leitor.importarArquivoParaLeitor();

        BufferedReader br = leitor.getLeitor();
        BufferPrimario bfp = new BufferPrimario(br);
        bfp.processarArquivoNoBufferPrimario();
        bfp.imprimirConteudoDoBufferPrimario(true);
    }
}
