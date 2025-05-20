package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor = new Professor("Jiraiya");
        Professor[] professores = {professor};
        Aluno escola = new Aluno("Konoha",professores);

        escola.imprime();
    }

}
