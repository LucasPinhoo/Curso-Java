package aprendendo.javacore.Hheranca.Test;

import aprendendo.javacore.Hheranca.Domain.Endereco;
import aprendendo.javacore.Hheranca.Domain.Funcionario;
import aprendendo.javacore.Hheranca.Domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-678");
        Pessoa pessoa = new Pessoa("Titi");

        pessoa.setEndereco(endereco);
        pessoa.setCpf("11111111");
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Zuryn");

        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");

        funcionario.imprime();
    }
}
