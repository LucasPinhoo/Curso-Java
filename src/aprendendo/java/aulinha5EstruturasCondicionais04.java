package aprendendo.java;


public class aulinha5EstruturasCondicionais04 {
    public static void main(String[] args) {
        // $ 0    $ 34,712   9.70%
        // $ 34,713  $ 68,507  37.35%
        // $ 68,508            49.50%

        double salarioAnual = 70000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712){
            salarioAnual = salarioAnual * primeiraTaxa;
        } else if (salarioAnual > 34713 && salarioAnual <= 68507) {
            salarioAnual = salarioAnual * segundaTaxa;
        }else {
            salarioAnual = salarioAnual * terceiraTaxa;
        }
        System.out.println(salarioAnual);
    }
}
