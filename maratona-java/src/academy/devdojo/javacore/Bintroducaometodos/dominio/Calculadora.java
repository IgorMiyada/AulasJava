package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public int a;
    public int b;
    public double somaDoisNumeros(int num1, int num2){
        return num1+num2;
    }
    public double subtraiDoisNumeros(int num1, int num2){
        return num1-num2;
    }

    public double multiplicaDoisNumeros(int num1, int num2){
        return num1*num2;
    }

    public double divideDoisnumeros(int num1, int num2){
        if(num2==0){
            return 0;
        }
        else return (num1/num2);
    }

    public void imprimeDivisaoDeDoisNumeros(int num1, int num2){
        if(num2==0){
            System.out.println("Não é possível dividir por 0 ");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1= 99;
        numero2= 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num 1 : " + numero1);
        System.out.println("Num 2 : " + numero2);
    }

    public void somaArray(int[] numeros){
       int soma=0;
        for(int number:numeros){
            soma+=number;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma=0;
        for(int number:numeros){
            soma+=number;
        }
        System.out.println(soma);
    }
}
