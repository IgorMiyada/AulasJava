package academy.devdojo.javacore.Oexceptions.runtime.test.error;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest5 {
    public static void main(String[] args) {
        try{

        }catch(ArrayIndexOutOfBoundsException |  IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do multi-catch em linha");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            talvezLanceException();
        }catch(SQLException e){

        }catch (FileNotFoundException e){

        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
