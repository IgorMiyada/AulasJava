package academy.devdojo.javacore.GassociacaoExercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    Seminario seminario;

    public Aluno(String nome, int idade){
        if(nome==null){
            return;
        }
        this.nome = nome;
        this.idade=idade;
    }
    public Aluno(String nome, int idade, Seminario seminario){
        if(nome==null){
            return;
        }
        this.nome = nome;
        this.idade=idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Nome do aluno : ");
        System.out.print(this.nome + "," + this.idade + " anos" );
        if(seminario != null){
            System.out.println(".Seminario escolhido : " + seminario.getTitulo());
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
