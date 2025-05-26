package academy.devdojo.javacore.KtipoEnum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor=valor;
        this.nomeRelatorio=nomeRelatorio;
    }

    //Retornar a enumeração baseada na String
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){

            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor(){
        return this.valor;
    }

    public String getNomeRelatorio(){
        return this.nomeRelatorio;
    }
}
