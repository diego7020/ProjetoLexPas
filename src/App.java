import Mecanismo.Processamento;

public class App {
    public static void main(String[] args) throws Exception {
        //TesteBufferSecundario.executar();
        executar();

    }

    public static void executar(){
        Processamento proc = new Processamento();
        proc.prepararTabelaSimboloPrograma();
        proc.imprimirTabelaSimbolosPrograma();
    }
}
