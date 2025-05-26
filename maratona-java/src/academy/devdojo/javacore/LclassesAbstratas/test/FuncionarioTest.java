package academy.devdojo.javacore.LclassesAbstratas.test;

import academy.devdojo.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Igor",20000);
        Desenvolvedor desenvolvedor= new Desenvolvedor("Zoro",8000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
