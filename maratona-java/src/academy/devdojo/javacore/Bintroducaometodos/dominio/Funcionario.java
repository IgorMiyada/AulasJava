package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime(){
        System.out.println("Nome : " + this.nome + "\nIdade : " + this.idade);
        for(double salario: this.salario){
            System.out.println("Salário : " + salario);
        }
        System.out.println("------------");
        mediaSalarialDosFuncionario(this.salario);
    }

    public void mediaSalarialDosFuncionario(double[] salarioFuncionario){
        salarioFuncionario[0] = 9000;
        salarioFuncionario[1] = 11000;
        salarioFuncionario[2] = 5500;

        for(double salario: salarioFuncionario){
            media+=salario;
        }
        System.out.println((media/ salarioFuncionario.length));


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
