package aprendendo.javacore.Csobrecargametodos.Test;

import aprendendo.javacore.Csobrecargametodos.Dominio.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();
        serie.init("YOU", "Streaming", "Stalker, Perseguição", 10);
        serie.imprime();
    }
}
