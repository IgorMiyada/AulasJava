package academy.devdojo.javacore.Vinputoutput.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileReader
//FileWriter
//BufferedReader
//BufferedWriter
public class FileWriteTest {
    public static void main(String[] args) {
        File file = new File("C:\\Igor\\Java\\AulasJava\\maratona-java\\arquivo\\file.txt");
        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("Igor is gonna become a very sucessful person");
            fw.flush();
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
