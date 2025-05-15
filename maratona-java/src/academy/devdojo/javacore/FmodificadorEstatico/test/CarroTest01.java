package academy.devdojo.javacore.FmodificadorEstatico.test;

import academy.devdojo.javacore.FmodificadorEstatico.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",250);
        Carro carro2 = new Carro("Mercedes",200);
        Carro carro3 = new Carro("Ferrari", 200);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
