package aprendendo.javacore.Npolimorfismo.Test;

import aprendendo.javacore.Npolimorfismo.Domain.Computador;
import aprendendo.javacore.Npolimorfismo.Domain.Service.CalculadoraImposto;
import aprendendo.javacore.Npolimorfismo.Domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
