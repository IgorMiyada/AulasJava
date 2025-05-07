package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "HRV HONDA";
        carro1.ano = 2025;
        carro1.modelo = "SUV";

        carro2.nome = "Fox Volkswagen";
        carro2.ano = 2013;
        carro2.modelo= "Hatch";

        System.out.println(carro1.nome + " " + carro1.modelo +" " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo +" " + carro2.ano);
    }
}
