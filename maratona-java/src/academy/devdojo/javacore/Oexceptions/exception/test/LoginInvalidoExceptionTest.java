package academy.devdojo.javacore.Oexceptions.exception.test;

import academy.devdojo.javacore.Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException error){
            error.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String loginDb = "igor";
        String passwordDb = "123456";
        System.out.print("Digite sua login :");
        String loginTyped = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String passwordTyped = scanner.nextLine();
        if(loginTyped.equals(loginDb) && passwordTyped.equals(passwordDb)){
            System.out.println("Login feito com sucesso");
        }
        else{
            throw new LoginInvalidoException();
        }

    }
}
