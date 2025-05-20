package academy.devdojo.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDeDadosTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome : ");
        String nome = entrada.nextLine();
        System.out.print("Digte sua idade : ");
        int idade = entrada.nextInt();
        System.out.print("Digite M ou F para sexo : ");
        char sexo = entrada.next().charAt(0);
        System.out.println("Seu nome é  " + nome + ", do sexo "+ sexo +" e tem " + idade + " anos");
    }
}
