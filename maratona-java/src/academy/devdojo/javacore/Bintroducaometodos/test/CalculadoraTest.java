package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somaDoisNumeros(8,45));
        System.out.println(calculadora.subtraiDoisNumeros(10,11));
        System.out.println(calculadora.multiplicaDoisNumeros(51,27));
        System.out.println(calculadora.divideDoisnumeros(9,4));
        calculadora.imprimeDivisaoDeDoisNumeros(7,0);
    }

}
