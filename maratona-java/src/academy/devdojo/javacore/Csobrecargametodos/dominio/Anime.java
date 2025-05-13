package academy.devdojo.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprime(){
        System.out.println("Tipo de anime : " + this.tipo);
        System.out.println("Total de episódios :  " + this.episodios);
    }

    public void init(String nome, String tipo, int episodios){
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
    }

    public void init(String nome, String tipo, int episodios,String genero){
        init(nome,tipo,episodios);
        this.genero = genero;
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
}
