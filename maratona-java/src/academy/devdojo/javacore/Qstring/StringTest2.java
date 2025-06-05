package academy.devdojo.javacore.Qstring;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "123456";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","c"));
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());

    }
}
