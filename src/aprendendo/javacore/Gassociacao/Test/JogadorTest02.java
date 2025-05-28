package aprendendo.javacore.Gassociacao.Test;

import aprendendo.javacore.Gassociacao.Domain.Jogador;
import aprendendo.javacore.Gassociacao.Domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Time time = new Time("Portugal");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
