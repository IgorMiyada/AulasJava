package academy.devdojo.javacore.JmodificadorFinal.test;

import academy.devdojo.javacore.JmodificadorFinal.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda City");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Igor");
        System.out.println(carro.COMPRADOR);
    }
}
