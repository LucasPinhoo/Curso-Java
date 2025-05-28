package aprendendo.javacore.Eblocosinicializacao.Test;

import aprendendo.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }


    }
}
