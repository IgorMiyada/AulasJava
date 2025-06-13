package academy.devdojo.javacore.Vinputoutput.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("C:\\Igor\\Java\\AulasJava\\maratona-java\\arquivo\\file.txt");
        try(FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String linhaDeTexto;
            while((linhaDeTexto = bufferedReader.readLine()) != null){
                System.out.println(linhaDeTexto);
            }
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
