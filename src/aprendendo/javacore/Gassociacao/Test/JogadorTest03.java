package aprendendo.javacore.Gassociacao.Test;

import aprendendo.javacore.Gassociacao.Domain.Jogador;
import aprendendo.javacore.Gassociacao.Domain.Time;
// Aula 67
// Não endendi muito bem
public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Gareth Bale");
        Time time = new Time("Wales");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---- Jogador ----");
        jogador.imprime();
        System.out.println("---- Time ----");
        time.imprime();
    }
}
