package Dominio;

import java.util.HashMap;
import java.util.Map;

public class TabelaSimboloLinguagem {

    private static final Map<String, TokenType> tabela = new HashMap<>();

    static {
        String[] palavrasReservadas = {
            "absolute",
            "abstract",
            "and",
            "append",
            "array",
            "as",
            "asm",
            "assign",
            "begin",
            "blink",
            "blue",
            "break",
            "brown",
            "case",
            "char",
            "chr",
            "class",
            "close",
            "clrscr",
            "const",
            "constructor",
            "continue",
            "cyan",
            "darkgray",
            "destructor",
            "div",
            "do",
            "downto",
            "else",
            "end",
            "eof",
            "except",
            "exports",
            "false",
            "file",
            "finalization",
            "finally",
            "for",
            "forward",
            "function",
            "goto",
            "gotoxy",
            "green",
            "if",
            "implementation",
            "in",
            "inherited",
            "initialization",
            "inline",
            "integer",
            "interface",
            "is",
            "label",
            "length",
            "library",
            "lightbue",
            "lightcyan",
            "lightgray",
            "lightgreen",
            "lightmagenta",
            "lightred",
            "magenta",
            "mod",
            "nil",
            "not",
            "object",
            "of",
            "or",
            "ord",
            "out",
            "overload",
            "override",
            "packed",
            "procedure",
            "program",
            "property",
            "raise",
            "read",
            "readkey",
            "readln",
            "real",
            "record",
            "red",
            "repeat",
            "reset",
            "resourcestring",
            "rewrite",
            "set",
            "shl",
            "shr",
            "string",
            "text",
            "textbackground",
            "textcolor",
            "then",
            "threadvar",
            "to",
            "true",
            "try",
            "type",
            "unit",
            "until",
            "uses",
            "var",
            "while",
            "white",
            "with",
            "write",
            "writeln",
            "xor",
            "yellow"
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
