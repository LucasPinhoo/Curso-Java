package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Mark";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Eve";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
