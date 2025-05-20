package academy.devdojo.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    //Array de professores, pois ma escola pode ter vários professores
    private Professor[] professores;

    public Aluno(String nome){
        this.nome=nome;
    }

    public Aluno(String nome, Professor[] professores){
        this.nome=nome;
        this.professores=professores;
    }

    public void imprime(){
        if(nome==null){
            return;
        }
        System.out.println(nome);
        for(Professor professor:professores){
            System.out.println(professor.getNome());
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}
