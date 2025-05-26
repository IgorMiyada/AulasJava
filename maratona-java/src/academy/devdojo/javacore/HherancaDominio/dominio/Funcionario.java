package academy.devdojo.javacore.HherancaDominio.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização do Funcionario1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização do Funcionario2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro de construtor de Funcionario");
    }

    public Funcionario(String nome, String cpf) {
        super(nome,cpf);
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
