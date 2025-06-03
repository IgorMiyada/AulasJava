package academy.devdojo.javacore.Oexceptions.exception.test;

import academy.devdojo.javacore.Oexceptions.exception.dominio.Leitor1;
import academy.devdojo.javacore.Oexceptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo1();
        lerArquivo2();
        lerArquivo3();
    }

    public  static void lerArquivo1(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("teste.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch(IOException e){
                System.out.println("O arquivo não contém nada");
            }
        }
    }
    //Try with resources
    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch(IOException e ){
            e.printStackTrace();
        }
    }

    //Leitores são fechadaos em ordem inversa que são chamadas
    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}
