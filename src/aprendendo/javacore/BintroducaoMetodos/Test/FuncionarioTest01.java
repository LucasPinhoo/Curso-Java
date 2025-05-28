package aprendendo.javacore.BintroducaoMetodos.Test;

import aprendendo.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Mbappé");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

        System.out.println("Média"+ funcionario.getMedia());
        
    }
}
