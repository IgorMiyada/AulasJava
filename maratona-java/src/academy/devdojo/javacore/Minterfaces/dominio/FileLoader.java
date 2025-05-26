package academy.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando arquivo de dados");
    }
    @Override
    public void removeData(){
        System.out.println("Removendo arquivo");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no arquivo");
    }
}
