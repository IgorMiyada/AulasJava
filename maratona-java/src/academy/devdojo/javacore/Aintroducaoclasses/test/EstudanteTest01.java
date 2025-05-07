package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome="Luffy";
        estudante.idade=18;
        estudante.sexo='M';
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
