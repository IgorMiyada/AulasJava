package academy.devdojo.javacore.GassociacaoExercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade){
        if(nome == null){
            return;
        }
        this.nome =nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade,Seminario[] seminarios){
        if(nome == null){
            return;
        }
        this.nome =nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("#Professores#");
        System.out.println(this.nome + " . Especialidade : " + this.especialidade);
        if(this.seminarios != null){
            System.out.println("#Seminários Cadastrados#");
            for(Seminario seminario:this.seminarios){
                System.out.println("Seminario: " + seminario.getTitulo() +"\n" +
                        "Endereço : " + seminario.getLocal().getRua() + " " + seminario.getLocal().getBairro() + " " + seminario.getLocal().getNumero());
                if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
                System.out.println("#Alunos#");
                for(Aluno aluno:seminario.getAlunos()){
                    System.out.println("Aluno : " + aluno.getNome());
                }
            }
        }
        System.out.println("----------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios(){
        return this.seminarios;
    }
    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
}
