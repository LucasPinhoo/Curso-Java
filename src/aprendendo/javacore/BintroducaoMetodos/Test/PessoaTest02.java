package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Pessoa02;

public class PessoaTest02 {
    public static void main(String[] args) {
        Pessoa02 pessoa02 = new Pessoa02();
        pessoa02.setNome("Barret");
        pessoa02.setIdade(40);
        System.out.println(pessoa02.getNome());
        System.out.println(pessoa02.getIdade());
    }
}
