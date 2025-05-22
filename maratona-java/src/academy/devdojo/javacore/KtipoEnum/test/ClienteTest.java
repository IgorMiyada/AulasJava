package academy.devdojo.javacore.KtipoEnum.test;

import academy.devdojo.javacore.KtipoEnum.dominio.Cliente;
import academy.devdojo.javacore.KtipoEnum.dominio.TipoCliente;
import academy.devdojo.javacore.KtipoEnum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Lemillion", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Igor",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
