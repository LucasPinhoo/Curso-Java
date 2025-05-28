package aprendendo.java;

public class aulinha5EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo
        // MINHA VERSÃO!!!!
        int day = 1;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;

            default:
                System.out.println("Favor digitar apenas os números de 1 a 7!");
                break;

        }
    }
}
