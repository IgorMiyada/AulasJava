package academy.devdojo.javacore.NPolimorfismo.test;

import academy.devdojo.javacore.NPolimorfismo.repositorio.Repositorio;
import academy.devdojo.javacore.NPolimorfismo.servico.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        //A funcionalidade do polimorfismo, se mostra nesse caso, caso eu queira mudar o tipo de repositorio que vai ser salvo, eu consigo fazer isso
        //apenas mudadndo o objeto que estou instanciando
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
