package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Robinho");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1,jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogadores:");

        jogador1.imprime();


        System.out.println("---Time");
        time.imprime();
    }
}
