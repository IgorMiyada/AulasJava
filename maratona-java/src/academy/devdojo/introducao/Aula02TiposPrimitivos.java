package academy.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String args[]){
        //int,double,float,char,byte,short,long,boolean
        int age = (int) 10000000000L;
        long bigNumber = (long) 155.23;
        double salarayDouble = 2000;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 100;

        System.out.println("I am " + age + " years old");
        System.out.println( bigNumber);
        System.out.println("My job pay me $" + salarayDouble);
        System.out.println("My job pay me $" + salaryFloat);
        System.out.println( ageByte);
        System.out.println( ageShort);
        System.out.println( verdadeiro);
        System.out.println( caractere);
    }
}
