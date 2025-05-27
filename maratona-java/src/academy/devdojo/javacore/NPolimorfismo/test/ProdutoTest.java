package academy.devdojo.javacore.NPolimorfismo.test;

import academy.devdojo.javacore.NPolimorfismo.dominio.Computador;
import academy.devdojo.javacore.NPolimorfismo.dominio.Televisao;
import academy.devdojo.javacore.NPolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador Ryze 5700",5000);
        Tomate tomate = new Tomate("Tomate cereja",15);
        Televisao televisao = new Televisao("Samsung 40",1500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
