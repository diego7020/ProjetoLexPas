package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeArquivo {
    private String caminhoDoArquivo;

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    private BufferedReader leitor;

    public BufferedReader getLeitor() {
        return leitor;
    }

    public void carregarArquivoParaLeitor(String caminhoCompleto){
        this.caminhoDoArquivo = caminhoCompleto;
    }

    public void carregarArquivoParaLeitor(){
        System.out.println("----------------------------------");
        System.out.println("### Carregar Arquivo de Testes ###");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do diretório: ");
        String diretorio = sc.next();
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = sc.next();
        this.caminhoDoArquivo = diretorio + "\\" + nomeArquivo;
        sc.close();
    }

    public void importarArquivoParaLeitor(){
        this.leitor = null;
        try {
            this.leitor = new BufferedReader(new FileReader(this.caminhoDoArquivo));
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            System.err.println(e);
        }
    }
}
