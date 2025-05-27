package academy.devdojo.javacore.NPolimorfismo.servico;

import academy.devdojo.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um aquivo");
    }
}
