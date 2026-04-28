package Dominio;

import java.util.HashMap;
import java.util.Map;

public class TabelaSimboloLinguagem {

    private static final Map<String, TokenType> tabela = new HashMap<>();

    static {
        String[] palavrasReservadas = {
            "if",
            "else",
            "while",
            "for",
            "do",
            "to",
        };

        for(String palavra : palavrasReservadas){
            tabela.put(palavra, TokenType.KEYWORD);
        }

        String[] simbolos = {
            ".",
            ",",
            ";"
        };

        for (String simbolo : simbolos) {
            tabela.put(simbolo, TokenType.SYMBOL);
        }

        String[] operadoresMatematicos = {
            "+",
            "-",
            "*",
            "/",
            "%",
            "=",
            "<>"
        };

        for (String opermat : operadoresMatematicos) {
            tabela.put(opermat, TokenType.MATHOP);
        }

        String[] operadoresLogicos = {
            "<",
            ">",
            "<=",
            ">=",
            "=="
        };

        for (String opeLog : operadoresLogicos) {
            tabela.put(opeLog, TokenType.LOGICOP);
        }

        String[] delimitadores = {
            "(",
            ")",
            "[",
            "]",
            "{",
            "}"
        };

        for (String delim : delimitadores) {
            tabela.put(delim, TokenType.DELIM);
        }
    }

    public static TokenType buscar(String lexema){
        return tabela.getOrDefault(lexema.toLowerCase(), TokenType.UNKNOWN);
    }

    public static boolean contem(String lexema){
        return tabela.containsKey(lexema.toLowerCase());
    }
}
