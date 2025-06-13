package academy.devdojo.javacore.Vinputoutput.test;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("C:\\Igor\\Java\\AulasJava\\maratona-java\\arquivo\\file.txt");
        try(FileWriter fileWriter = new FileWriter(file);BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){

            bufferedWriter.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            //Lendo o arquivo para saber se a escrita foi feita de fato
            FileReader fileReader = new FileReader(file);
            char[] character = new char[1];
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            while((i=fileReader.read()) != -1){
                stringBuilder.append((char)i);
            }
            System.out.println(stringBuilder);
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
