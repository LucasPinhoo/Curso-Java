package aprendendo.javacore.Csobrecargametodos.Test;

import aprendendo.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("DBZ", "TV", 12, "Ação");
        anime.imprime();
    }
}
