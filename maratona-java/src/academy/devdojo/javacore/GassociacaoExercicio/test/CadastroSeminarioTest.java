package academy.devdojo.javacore.GassociacaoExercicio.test;

import academy.devdojo.javacore.GassociacaoExercicio.dominio.Aluno;
import academy.devdojo.javacore.GassociacaoExercicio.dominio.Local;
import academy.devdojo.javacore.GassociacaoExercicio.dominio.Professor;
import academy.devdojo.javacore.GassociacaoExercicio.dominio.Seminario;

//Crie um sistema que gerencie seminários
//
//O sistema irá cadastrar alunos, professores, seminários e o local onde deverá ser realizado
//
//Um aluno poderá estar em apenas um seminário
//Um seminário poderá ter nenhum ou vários alunos
//Um professor poderá ter vários seminários
//Um seminário deve ter um local
//
//Campos básicos
//Seminário : título;
//aluno : nome e idade;
//professor : nome e especialidade
//Local : Endereço
public class CadastroSeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Fernando de noronha","Vila Didi",486);
        Aluno aluno1 = new Aluno("Sabrina",20);
        Professor professor1 = new Professor("Cleiton","Matemática");
        Seminario seminario1 = new Seminario("Academy",local);
        Seminario[] seminarios = new Seminario[]{seminario1};
        Aluno[] alunos = new Aluno[]{aluno1};

        aluno1.setSeminario(seminario1);
        professor1.setSeminarios(seminarios);
        seminario1.setAlunos(alunos);
        System.out.println("############################");
        seminario1.imprime();
        aluno1.imprime();
        professor1.imprime();


        Local local2 = new Local("Rua Bahia","Vila dos dorminhocos",111);
        Seminario seminario2 = new Seminario("Empire States",local2);
        Aluno aluno2 = new Aluno("Igor",25,seminario2);
        Professor professor2 = new Professor("Gerson","Lógica de programação");
        seminarios = new Seminario[]{seminario2};
        alunos = new Aluno[]{aluno2};


        aluno2.setSeminario(seminario2);
        professor2.setSeminarios(seminarios);
        seminario2.setAlunos(alunos);
        System.out.println("############################");
        seminario2.imprime();
        aluno2.imprime();
        professor2.imprime();

    }
}
