package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}
