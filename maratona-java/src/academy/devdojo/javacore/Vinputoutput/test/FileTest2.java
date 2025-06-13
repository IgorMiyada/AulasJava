package academy.devdojo.javacore.Vinputoutput.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        String caminhoDiretorio = "C:\\Igor\\Java\\AulasJava\\maratona-java";

        File fileDiretorio = new File(caminhoDiretorio,"pasta");
        boolean isDirectoryCreated = fileDiretorio.mkdir();
        System.out.println("Diretório criado : " + isDirectoryCreated);
        File file = new File(fileDiretorio,"arquivoTest.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Arquivo foi criado ? " + isFileCreated);


        try(FileWriter fileWriter = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Testando arquivo um dois");
            bufferedWriter.flush();
        }catch(IOException error){
            error.printStackTrace();
        }

        File renameFile = new File(fileDiretorio,"arquivoRenomeado.txt");
        boolean isFileRenamed = file.renameTo(renameFile);
        System.out.println("Arquivo foi renomeado : " + isFileRenamed);
        File renameDirectory = new File(caminhoDiretorio,"pastaTest");
        boolean isDirecotoryRenamed = fileDiretorio.renameTo(renameDirectory);
        System.out.println("Diretório foi renomeado ? " + isDirecotoryRenamed);

    }
}
