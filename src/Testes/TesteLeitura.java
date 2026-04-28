package Testes;

import Exemplo.LeitorComTratamento;

// import Exemplo.LeitorSemTratamento;
// import java.io.IOException;

public class TesteLeitura{
    // public void executar() throws IOException{
    //     LeitorSemTratamento leitor = new LeitorSemTratamento();
    //     leitor.lerArquivo("c:\\temp\\existe.txt");
    // }

    public void executar(){
        LeitorComTratamento leitor = new LeitorComTratamento();
        leitor.lerArquivo("c:\\temp\\existe.txt");
    }
}
