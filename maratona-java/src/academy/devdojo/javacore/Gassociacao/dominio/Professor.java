package academy.devdojo.javacore.Gassociacao.dominio;

public class Professor {
    String nome;

    public Professor(String nome){
        if(nome==null) return;
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
