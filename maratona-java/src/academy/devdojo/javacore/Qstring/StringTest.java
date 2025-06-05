package academy.devdojo.javacore.Qstring;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William";
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        nome = "Igor";
        System.out.println(nome);
        System.out.println(nome==nome2);
        String nome3 = new String("William");//1 variável de referência, 2 objeto do tipo String, 3 uma string no pool de string
        System.out.println(nome2==nome3);
        System.out.println(nome2==nome3.intern());
    }
}
