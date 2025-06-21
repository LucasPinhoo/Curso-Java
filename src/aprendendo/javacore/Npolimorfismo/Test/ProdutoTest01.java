package aprendendo.javacore.Npolimorfismo.Test;

import aprendendo.javacore.Npolimorfismo.Domain.Computador;
import aprendendo.javacore.Npolimorfismo.Domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------------------");
        aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
