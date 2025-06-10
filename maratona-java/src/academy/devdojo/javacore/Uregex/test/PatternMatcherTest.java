package academy.devdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        //Alguns meta characters
        // \d = Todos os dígitos
        // \D = Todos os não dígitos
        // \s  = Todos os espaços em branco
        // \S = Todos os espaços que não estão vazios
        // \w = Todos os caracteres de a-z ou A-Z, e dígitos
        // \W = Tudo o que o \w não inclui
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // o(v|c)o pode achar ovo ou oco
        // $
        // . 1.3 = 123,1@3,1/3
        // ^ [^123]

        String regex = "\\d";
        String texto ="das8w0938120jaa";
        String regex2 = "[a-zA-E]";
        String texto2 = "abcdefgABCDEF";
        //Começa com 0, segue de x ou X, tenha o conteúdo [0-9a-fA-F] uma ou mais vezes, e seja seguido de um espaço em branco ou seja final de linha
        String regexNumeroHexadecimanl = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String textoHexadecimal = "12 0x 0x 0xFFABC 0x10G 0x1";
        String regexValidaEmail = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String emails = "luffy@hotmail.com, jotaro@gmail.com , #@fds@hotmail.com, goldenoutlook.com";
        //Separa todos os valores por virgula
        System.out.println(Arrays.toString(emails.split(",")));
        encontraTexto(regex,texto);
        encontraTexto(regex2,texto2);
        encontraTexto(regexNumeroHexadecimanl,textoHexadecimal);
        encontraTexto(regexValidaEmail,emails);

    }

    private static void encontraTexto(String regex,String texto){
        //Compila o texto que está procurando
        Pattern pattern = Pattern.compile(regex);
        //Pega todas as "matches" que foram  encontradas no texto
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto :  " + texto);
        System.out.println("Indice : 012345678");
        System.out.println("Regex : " + regex);
        System.out.println("Posições encontradas : ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.println("-------------------------------");
    }
}
