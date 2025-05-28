package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Pessoa04;

public class PessoaTest04 {
    public static void main(String[] args) {
        Pessoa04 pessoa = new Pessoa04();
        pessoa.setNome("Aerith");
        pessoa.setIdade(19);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
