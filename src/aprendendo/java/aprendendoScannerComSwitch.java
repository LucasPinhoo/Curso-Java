package aprendendo.java;

import java.util.Scanner;

public class aprendendoScannerComSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite (M) para Masculino e (F) para Feminino: ");
        char sexo = scan.next().charAt(0);
        switch (sexo) {
            case 'M':
            case 'm':
                System.out.println("Masculino");
                break;
            case 'F':
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Erro! Favor digitar apenas (M) ou (F) ");
                break;
        }
        scan.close();
    }
}
