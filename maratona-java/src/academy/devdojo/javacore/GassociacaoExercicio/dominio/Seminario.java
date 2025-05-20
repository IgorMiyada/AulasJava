package academy.devdojo.javacore.GassociacaoExercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo,Local local){
        if(titulo==null){
            return;
        }
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Professor professor, Local local) {
        if(titulo==null){
            return;
        }
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Título seminário : " + this.titulo);
        System.out.println("Local do seminário : " + this.local.getRua() + " " + this.getLocal().getBairro() + " " + this.local.getNumero());
        if(this.alunos != null){
            for(Aluno aluno:this.alunos){
                System.out.println(aluno.getNome() + " " + aluno.getIdade());
            }
        }


        System.out.println("----------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local local){
        this.local=local;
    }
}
