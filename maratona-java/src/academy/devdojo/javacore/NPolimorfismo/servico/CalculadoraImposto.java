package academy.devdojo.javacore.NPolimorfismo.servico;
import academy.devdojo.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.javacore.NPolimorfismo.dominio.Tomate;


public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Calculando imposto sobre o tomate : ");
        double imposto = produto.calcularImpostoProduto();
        System.out.println("Nome : " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto a ser taxado : " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade : " + tomate.getDataValidade());
        }
    }
}
