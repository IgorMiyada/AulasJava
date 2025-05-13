package academy.devdojo.javacore.Csobrecargametodos.test;

import academy.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12,"Ação");
        anime.imprime();
    }
}
