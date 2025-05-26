package academy.devdojo.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    default void checkPermission(){
        System.out.println("Checando pemissões");
    };

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface DataLoader");
    }
}
