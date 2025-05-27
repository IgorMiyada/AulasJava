package academy.devdojo.javacore.NPolimorfismo.servico;

import academy.devdojo.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em memória");
    }
}
