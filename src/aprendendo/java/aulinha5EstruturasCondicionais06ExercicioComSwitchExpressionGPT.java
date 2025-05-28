package aprendendo.java;

import java.util.Scanner;

public class aulinha5EstruturasCondicionais06ExercicioComSwitchExpressionGPT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7, onde 1 é domingo: ");
        int dia = scan.nextInt();

        String resultado = switch (dia){
            case 1,7 -> "Final de semana";
            case 2, 3, 4, 5, 6 -> "Dias da semana";
            default -> "Número inválido! Digite apenas os números de 1 a 7";
        };
        System.out.println(resultado);
        scan.close();

    }
}
