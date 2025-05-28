package aprendendo.javacore.Minterfaces.Test;

import aprendendo.javacore.Minterfaces.Domain.DataBaseLoader;
import aprendendo.javacore.Minterfaces.Domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
    }
}
