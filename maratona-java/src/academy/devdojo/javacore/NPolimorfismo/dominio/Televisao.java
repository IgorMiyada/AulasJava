package academy.devdojo.javacore.NPolimorfismo.dominio;

public class Televisao extends Produto{
    private static final double  IMPOSTO_POR_CENTO = 0.15;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
