package aprendendo.javacore.Lclassesabstratas.Test;

import aprendendo.javacore.Lclassesabstratas.Domain.Desenvolvedor;
import aprendendo.javacore.Lclassesabstratas.Domain.Funcionario;
import aprendendo.javacore.Lclassesabstratas.Domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Francky", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
