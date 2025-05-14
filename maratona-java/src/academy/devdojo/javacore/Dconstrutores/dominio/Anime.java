package academy.devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    public String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
       this(nome,tipo,episodios,genero);
       this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println("Tipo de anime : " + this.tipo);
        System.out.println("Total de episódios :  " + this.episodios);
        System.out.println(genero);
        System.out.println(episodios);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
