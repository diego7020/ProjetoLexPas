package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {
    private String caminhoDoArquivo;

    public String getCaminhoDoArquivo(){
        return caminhoDoArquivo;
    }

    private BufferedReader leitor;

    public BufferedReader getLeitor(){
        return leitor;
    }

    public void carregarArquivoParaLeitor(){
        System.out.println("### carregar arquivo para testes #");
        Scanner scan = new Scanner(System.in);
        System.out.print("INforme o diretorio: ");
        String diretorio = scan.next();
        System.out.print("Informe o nome do arquivo: ");
        String nomeArquivo = scan.next();
        this.caminhoDoArquivo = diretorio + "/" + nomeArquivo;
        scan.close();
    }

    public void carregarArquivoParaLeitor(String caminhoCompleto){
        this.caminhoDoArquivo = caminhoCompleto;
    }

    public void importarDadosParaLeitor(){
        this.leitor = null;
        try {
            this.leitor = new BufferedReader(new FileReader(this.caminhoDoArquivo));
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            System.err.println(e);
        }

    }
}
