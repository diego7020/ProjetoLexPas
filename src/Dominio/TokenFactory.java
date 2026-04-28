package Dominio;

public class TokenFactory {
    public static Token criarToken(String lexema, int linha, int posicao){
        TokenType tipo = TabelaSimboloLinguagem.buscar(lexema);
        return new Token(tipo, lexema, linha, posicao);
    }
}
