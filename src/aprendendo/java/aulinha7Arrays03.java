package aprendendo.java;

public class aulinha7Arrays03 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String

        String [] nomes = new String[3];
        nomes[0] = "Pokémon";
        nomes[1] = "Digimon";
        nomes[2] = "Yu-Gi-Oh";
        //Pode usar ".length" no lugar do número do array pra facilitar
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
