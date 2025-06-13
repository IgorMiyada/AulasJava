package academy.devdojo.javacore.Vinputoutput.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("C:\\Igor\\Java\\AulasJava\\maratona-java\\arquivo\\file.txt");
        try(FileReader fileReader = new FileReader(file)){
            /*char[] in = new char[1];
            fileReader.read(in);
            for(char c : in){
                System.out.println(c);
            }*/
            int i;
            while((i=fileReader.read()) != -1){
                System.out.print((char)i);
            }
        }catch(IOException error){
            error.printStackTrace();
        }

    }
}
