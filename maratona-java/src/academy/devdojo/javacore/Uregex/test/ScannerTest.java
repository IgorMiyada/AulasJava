package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "Gustave, Levi, Sophie";
        String[] nomes = texto.split(",");
        for(String nome:nomes){
            System.out.println(nome.trim());
        }

    }
}
