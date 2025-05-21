package academy.devdojo.javacore.HherancaDominio.test;

import academy.devdojo.javacore.HherancaDominio.dominio.Endereco;
import academy.devdojo.javacore.HherancaDominio.dominio.Funcionario;
import academy.devdojo.javacore.HherancaDominio.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua 5","1154708");
        Pessoa pessoa = new Pessoa("Jonathan");
        Funcionario funcionario = new Funcionario("Oden");

        pessoa.setCpf("1154564654646");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        funcionario.setCpf("777777884545777");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(104547);
        funcionario.imprime();
    }
}
