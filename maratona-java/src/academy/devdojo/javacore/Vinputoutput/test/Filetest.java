package academy.devdojo.javacore.Vinputoutput.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class Filetest {
    public static void main(String[] args) {
        File file = new File("C:\\Igor\\Java\\AulasJava\\maratona-java\\arquivo\\file.txt");
        try{
            if(file.exists()){
                file.delete();
                System.out.println("Deleted");
            }else{
                file.createNewFile();
                System.out.println("Created");
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getPath());
                System.out.println(file.isDirectory());
                System.out.println(file.isFile());
                System.out.println(new Date(file.lastModified()));
            }

        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
