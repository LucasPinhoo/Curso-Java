package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cloud Strife");
        pessoa.setIdade(21);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
