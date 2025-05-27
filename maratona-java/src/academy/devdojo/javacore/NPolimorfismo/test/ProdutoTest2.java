package academy.devdojo.javacore.NPolimorfismo.test;

import academy.devdojo.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.javacore.NPolimorfismo.dominio.Produto;
import academy.devdojo.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.NPolimorfismo.servico.CalculadoraImposto;

//Widening Casting
public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImpostoProduto());
        System.out.println("-------------------");

        Produto produto2 = new Tomate("Americano",20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImpostoProduto());
    }
}
