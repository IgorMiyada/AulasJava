package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Igor");
        funcionario1.setIdade(25);
        funcionario1.setSalario(new double[]{9000,11000,5500});

        funcionario1.imprime();
    }
}
