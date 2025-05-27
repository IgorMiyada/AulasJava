package academy.devdojo.javacore.NPolimorfismo.test;

import academy.devdojo.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.NPolimorfismo.servico.CalculadoraImposto;

//Narrow Casting
public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",4000);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-------------------");

        Tomate tomate = new Tomate("Americano",20);
        tomate.setDataValidade("26/06/2025");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
