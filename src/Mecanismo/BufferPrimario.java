package Mecanismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferPrimario {
    private BufferedReader leitor;

    private ArrayList<String> bufferPrimario;

    public BufferedReader getLeitor() {
        return leitor;
    }

    public ArrayList<String> getBufferedPrimario() {
        return bufferPrimario;
    }

    public BufferPrimario(BufferedReader leitor){
        this.leitor = leitor;
    }

    public void processarDadosDoBufferPrimario(){
        this.bufferPrimario = new ArrayList<>();
        try{
            String linha;
            while((linha = this.leitor.readLine()) != null){
                bufferPrimario.add(linha);
            }
        }
        catch(IOException ex){
            System.err.println();
        }
        finally{
            if (this.leitor != null){
                try {
                    this.leitor.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }

    public void imprimirConteudoDoBufferPrimario(boolean flag){
        if (flag){
            System.out.println("### Conteudo do buffer primario ###");
            for (String texto : this.bufferPrimario) {
                System.out.println(texto);                
            }
        }
    }
}
