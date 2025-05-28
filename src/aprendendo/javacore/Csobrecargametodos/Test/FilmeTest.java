package aprendendo.javacore.Csobrecargametodos.Test;

import aprendendo.javacore.Csobrecargametodos.Dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.init("Harry Potter", "Cinema", "Fantasia", 7);

        filme.imprime();

    }
}
