package Testes;

import Mecanismo.BufferPrimario;
import Mecanismo.BufferSecundario;
import Mecanismo.LeitorDeArquivo;
import java.io.BufferedReader;
import java.util.ArrayList;

public class TesteBufferSecundario {
    public static void executar(){
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
    }
}
