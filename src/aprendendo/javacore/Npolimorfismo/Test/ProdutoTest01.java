package aprendendo.javacore.Npolimorfismo.Test;

import aprendendo.javacore.Npolimorfismo.Domain.Computador;
import aprendendo.javacore.Npolimorfismo.Domain.Televisao;
import aprendendo.javacore.Npolimorfismo.Domain.Tomate;
import aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------------");
        aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
