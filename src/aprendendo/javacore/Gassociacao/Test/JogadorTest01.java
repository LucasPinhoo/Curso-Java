package aprendendo.javacore.Gassociacao.Test;

import aprendendo.javacore.Gassociacao.Domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Gareth Bale");
        Jogador jogador3 = new Jogador("Sergio Ramos");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            // para aparecer esse 'for' digite o nome da variavel que no caso é 'jogador' e aperta
            // ALT + ENTER, depois clica em "iterate" depois é só escrever o nome da variavel e o .imprime
            // caso queira imprimir
            jogador.imprime();
        }

    }
}
