package academy.devdojo.javacore.FmodificadorEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    //0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    //1 - Alocado espaço em mémoria para os objetos da classe
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o valor que tenha sido passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {

        for(int episodio:Anime.episodios){
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int[] getEpisodios() {
        return Anime.episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
