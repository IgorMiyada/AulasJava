package academy.devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDeDadosTest2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Faça uma pergunta de sim ou não: ");
        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}
