package Testes;

import Dominio.Token;
import Dominio.TokenFactory;

public class TesteToken {
    public static void executar(){
        //if(x==10);
        Token t1 = TokenFactory.criarToken("if", 1, 0);
        Token t2 = TokenFactory.criarToken("(", 1, 1);
        Token t3 = TokenFactory.criarToken("x", 1, 2);
        Token t4 = TokenFactory.criarToken("==", 1, 3);
        Token t5 = TokenFactory.criarToken("10", 1, 4);
        Token t6 = TokenFactory.criarToken(")", 1,5);
        Token t7 = TokenFactory.criarToken(";", 1,6);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
    }
}
