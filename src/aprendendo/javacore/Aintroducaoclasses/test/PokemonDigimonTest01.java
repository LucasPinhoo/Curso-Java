package aprendendo.javacore.Aintroducaoclasses.test;

import aprendendo.javacore.Aintroducaoclasses.dominio.PokemonDigimon;

public class PokemonDigimonTest01 {
    public static void main(String[] args) {
        PokemonDigimon charmander = new PokemonDigimon();
        PokemonDigimon agumon = new PokemonDigimon();
        charmander.primeiraEvolucao = "Charmilion";
        charmander.segundaEvolucao = "Charizard";
        charmander.terceiraEvolucao = "Mega Charizard X";

        agumon.primeiraEvolucao = "Greymon";
        agumon.segundaEvolucao = "Metal Greymon";
        agumon.terceiraEvolucao = "War Greymon";

        agumon = charmander;

        System.out.println("Charmander");
        System.out.println(charmander.primeiraEvolucao);
        System.out.println(charmander.segundaEvolucao);
        System.out.println(charmander.terceiraEvolucao);

        System.out.println("\nAgumon");
        System.out.println(agumon.primeiraEvolucao);
        System.out.println(agumon.segundaEvolucao);
        System.out.println(agumon.terceiraEvolucao);

    }
}
