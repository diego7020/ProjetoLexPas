package Mecanismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferPrimario {
    private BufferedReader leitor;

    private ArrayList<String> bufferPrimario;

    public ArrayList<String> getBufferPrimario() {
        return bufferPrimario;
    }

    public BufferPrimario(BufferedReader leitor){
        this.leitor = leitor;
    }
    
    public void processarArquivoNoBufferPrimario(){
        this.bufferPrimario = new ArrayList<>();
        try {
            String linha = "";
            while((linha = this.leitor.readLine()) != null){
                this.bufferPrimario.add(linha);
            }            
        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo.");
            System.err.println(e);
        } finally {
            if(this.leitor != null){
                try {
                    this.leitor.close();
                } catch (IOException e) {
                    System.err.println("Erro ao fechar o arquivo.");
                    System.err.println(e);
                }
            }
        }
    }

    public void imprimirConteudoDoBufferPrimario(Boolean flag){
        if (flag){
            System.out.println("------------------------------------");
            System.out.println("### Conteúdo do Buffer Primário: ###");
            for (String texto : bufferPrimario) {
                System.out.println(texto);
            }
        }
    }
}
