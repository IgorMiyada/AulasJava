package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest2 {
    public static void main(String[] args) {
        String texto = "Gustave, Levi, Sophie, 300, 350, true";
        Scanner scanner = new Scanner(texto);
        Pattern pattern = Pattern.compile("[,\\s*]");
        scanner.useDelimiter(pattern);
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            }else{
                System.out.println(scanner.next());
            }
        }

    }
}
