package academy.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        System.out.println("Resultado operações : soma = " + soma + ", subtração = " + subtracao
        + ", multiplicação = " + multiplicacao + ", divisão = " + divisao);

        // += -= *= /= %=
        int bonus = 1800;
        bonus -= 1000;
        bonus += 500;
        System.out.println("Bonus de : " + bonus);

        // %
        int resto = 10 % 7;
        System.out.println("Resto da divisão : " + resto);

        // < > <= >= == !=
        boolean isNumero1MaiorQueNumero2 = numero1 > numero2;
        boolean isNumero1MenorQueNumero2 = numero1 < numero2;
        boolean isNumero1IgualQueNumero2 = numero1 == numero2;
        boolean isNumero1DiferenteQueNumero2 = numero1 != numero2;
        System.out.println(isNumero1MaiorQueNumero2);
        System.out.println(isNumero1MenorQueNumero2);
        System.out.println(isNumero1IgualQueNumero2);
        System.out.println(isNumero1DiferenteQueNumero2);

        // && (and) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +  isDentroDaLeiMenorQueTrinta);

        float valorTotalContaCorrente = 2000F;
        float valorTotalPoupança = 7800F;
        float valorPlaystation5 = 4000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation5 || valorTotalPoupança>valorPlaystation5;
        System.out.println("Eu consigo comrar um playstation 5 ? " + isPlaystation5Compravel);
    }
}
