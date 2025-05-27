package academy.devdojo.javacore.NPolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.1;
    private String dataValidade;

    public Tomate(String nome,double valor){
        super(nome,valor);
    }

    @Override
    public double calcularImpostoProduto() {
        return valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
