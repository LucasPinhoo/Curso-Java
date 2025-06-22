package aprendendo.javacore.Npolimorfismo.Test;

import aprendendo.javacore.Npolimorfismo.Domain.Computador;
import aprendendo.javacore.Npolimorfismo.Domain.Produto;
import aprendendo.javacore.Npolimorfismo.Domain.Tomate;
import aprendendo.javacore.Npolimorfismo.Service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

      Tomate tomate = new Tomate("Americano", 20);
      tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
