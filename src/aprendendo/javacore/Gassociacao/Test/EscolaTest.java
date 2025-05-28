package aprendendo.javacore.Gassociacao.Test;

import aprendendo.javacore.Gassociacao.Domain.Escola;
import aprendendo.javacore.Gassociacao.Domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
