package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Igor");
        pessoa.setIdade(25);
        pessoa.imprime(pessoa);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
