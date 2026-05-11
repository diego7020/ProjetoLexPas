package Mecanismo;

import java.util.*;
import java.util.regex.*;

import Dominio.Token;

public class BufferSecundario {
    public ArrayList<String> bufferPrimario;

    public ArrayList<Token> bufferSecundario; 

    public ArrayList<Token> getBufferSecundario(){
        return this.bufferSecundario;
    }

    public BufferSecundario(ArrayList<String> buffer){
        this.bufferPrimario = buffer;
    }

    private Boolean IsCharacter(String valor){
        Pattern patt = Pattern.compile(PadroesLexicos.CHARACTER);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    private Boolean IsIdentifier(String valor){
        Pattern patt = Pattern.compile(PadroesLexicos.IDENTIFIER);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    private Boolean IsLiteral(String valor){
        Pattern patt = Pattern.compile(PadroesLexicos.LITERAL);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    private Boolean IsNumber(String valor){
        Pattern patt = Pattern.compile(PadroesLexicos.NUMBER);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    public void ProcessarBufferSecundario(){
        String capture = 
                        PadroesLexicos.COMMENT + "|" +
                        PadroesLexicos.NUMBER + "|" +
                        PadroesLexicos.LITERAL + "|" +
                        PadroesLexicos.WORDS + "|" +
                        PadroesLexicos.CHARACTER;
        
        this.bufferSecundario = new ArrayList<>();

        ArrayList<String> lexemasProcessados = new ArrayList<>();

        Pattern patt = Pattern.compile(capture);

        int linha = 1;
        for (String texto : this.bufferPrimario){
            Matcher match = patt.matcher(texto);
            Token valor = null;
            while(match.find()){
                String lexema = match.group();
                int posicao = match.start();
                if ((lexema.startsWith("//"))|| (lexema.startsWith("(*"))){
                    continue;
                }

                if (!lexemasProcessados.contains(lexema)){
                    lexemasProcessados.add(lexema);

                    
                }


            }
        }

    }

}
