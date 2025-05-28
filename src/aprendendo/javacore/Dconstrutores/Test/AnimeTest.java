package aprendendo.javacore.Dconstrutores.Test;


import aprendendo.javacore.Dconstrutores.Domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("DBS", "TV", 12, "Ação", "Toei Animation");
        anime.imprime();
    }
}
