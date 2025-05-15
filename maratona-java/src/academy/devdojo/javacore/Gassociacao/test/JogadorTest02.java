package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Inazuma");
        Time time = new Time("Super onze");
        
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
