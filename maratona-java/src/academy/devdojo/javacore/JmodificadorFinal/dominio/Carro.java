package academy.devdojo.javacore.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final int VELOCIDADE_LIMITE = 255;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
