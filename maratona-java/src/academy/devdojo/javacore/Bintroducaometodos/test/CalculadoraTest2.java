package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 2;
        int b = 3;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Fora do altera dois números");
        System.out.println("Num1 : " + a);
        System.out.println("Num1 : " + b);
    }
}
