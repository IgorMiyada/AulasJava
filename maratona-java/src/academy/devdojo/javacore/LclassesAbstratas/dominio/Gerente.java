package academy.devdojo.javacore.LclassesAbstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString(){
        return "Gerente : " + this.nome + "\n" +
                "Salário : " + this.salario;
    }
}
