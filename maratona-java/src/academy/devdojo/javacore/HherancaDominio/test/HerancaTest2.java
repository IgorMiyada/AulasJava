package academy.devdojo.javacore.HherancaDominio.test;

import academy.devdojo.javacore.HherancaDominio.dominio.Funcionario;

//0 - bloco de inicilização estático da super classe é executado quando a JVM carregar a classe pai
//0 - bloco de inicilização estático da subclasse é executado quando a JVM carregar a classe filha
//0 - Alocado espaço em memória para o o objeto da super classe
//0 - Cada atributo da superclasse é criado e instanciado com o valor default ou o valor que tenha sido passado
//0 - Bloco de inicialização da super classe é executado na ordem em que aparece
//0 - Construtor da superclasse é executado
//0 - Alocado espaço em memória para o objeto da subclasse
//0 - Cada atributo da subclasse é criado e instanciado com o valor default ou o valor que tenha sido passado
//0 - Bloco de inicialização da subclasse é executado na ordem em que aparece
//0 - Construtor da subclasse é exectuado

public class HerancaTest2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Igor","54646545",15000);
        funcionario.relatorioPagamento();
    }
}
