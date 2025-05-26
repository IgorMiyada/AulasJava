package academy.devdojo.javacore.Minterfaces.test;

import academy.devdojo.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args){
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
