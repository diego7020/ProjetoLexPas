package Dominio;

public class Token {
    private final TokenType tipo;
    private final String lexema;
    private final int posicao;

    public TokenType getTipo() {
        return tipo;
    }
    public String getLexema() {
        return lexema;
    }
    public int getPosicao() {
        return posicao;
    }

    public Token(TokenType tipo, String lexema, int posicao){
        this.tipo = tipo;
        this.lexema = lexema;
        this.posicao = posicao;
    }
    @Override
    public String toString() {
        return "Token [tipo=" + tipo + ", lexema=" + lexema + ", posicao=" + posicao + "]";
    }
    
}
