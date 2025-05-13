package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Igor";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Sabrina";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
