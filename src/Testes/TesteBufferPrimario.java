package Testes;

import Mecanismo.BufferPrimario;
import Mecanismo.LeituraArquivo;
import java.io.BufferedReader;

public class TesteBufferPrimario {
    public static void executar() {
        LeituraArquivo leitura = new LeituraArquivo();
        leitura.carregarArquivoParaLeitor();
        leitura.importarDadosParaLeitor();

        BufferedReader leitor = leitura.getLeitor();

        BufferPrimario bfp = new BufferPrimario(leitor);
        bfp.processarDadosDoBufferPrimario();
        bfp.imprimirConteudoDoBufferPrimario(true);
    }
}
