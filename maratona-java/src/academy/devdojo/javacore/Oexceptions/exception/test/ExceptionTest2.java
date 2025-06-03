package academy.devdojo.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo()throws IOException{
        File file = new File("arquivo\\test.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException error){
            error.printStackTrace();
            //relançando a exceção
            throw error;
        }
    }
}
