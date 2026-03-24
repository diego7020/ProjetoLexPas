package Dominio;

public class TokenFactory {
    public static Token criarToken(String lexema, int posicao){
        TokenType tipo = TabelaSimboloLInguagem.buscar(lexema);
        return new Token(tipo, lexema, posicao);

    }
    
}
