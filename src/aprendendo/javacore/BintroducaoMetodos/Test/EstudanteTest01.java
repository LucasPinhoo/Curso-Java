package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Estudante;
import aprendendo.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Mark";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Eve";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
