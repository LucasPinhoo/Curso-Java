package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Pessoa03;

public class PessoaTest03 {
    public static void main(String[] args) {
        Pessoa03 pessoa = new Pessoa03();
        pessoa.setNome("Tifa");
        pessoa.setIdade(0);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        ;
    }
}
