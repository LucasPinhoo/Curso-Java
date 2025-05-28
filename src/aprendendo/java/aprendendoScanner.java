package aprendendo.java;


import java.util.Scanner;

// $ 0    $ 34,712   9.70%
// $ 34,713  $ 68,507  37.35%
// $ 68,508            49.50%
public class aprendendoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário anual: ");
        double salarioAnual = scanner.nextDouble();
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 9.70 / 100;
        } else if (salarioAnual > 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * 37.35 / 100;
        } else {
            valorImposto = salarioAnual * 49.50 / 100;
        }
        System.out.println("Seu imposto anual atualmente é de: " + valorImposto);


    }
}
