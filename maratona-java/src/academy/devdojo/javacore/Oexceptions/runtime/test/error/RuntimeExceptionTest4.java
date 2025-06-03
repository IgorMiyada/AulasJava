package academy.devdojo.javacore.Oexceptions.runtime.test.error;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    public static void main(String[] args) {
        try{

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
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
