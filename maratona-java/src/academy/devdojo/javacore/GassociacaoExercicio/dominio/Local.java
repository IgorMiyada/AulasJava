package academy.devdojo.javacore.GassociacaoExercicio.dominio;

public class Local {
    private String rua;
    private String bairro;
    private int numero;

    public Local(String rua, String bairro, int numero){
        if(rua==null){
            return;
        }
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
