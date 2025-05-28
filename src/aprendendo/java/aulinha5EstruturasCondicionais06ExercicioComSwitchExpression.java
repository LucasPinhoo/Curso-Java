package aprendendo.java;

public class aulinha5EstruturasCondicionais06ExercicioComSwitchExpression {
    public static void main(String[] args) {
        // VERSÃO DE ALGUEM NOS COMENTARIOS
        int dia = 2;
        switch (dia) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> throw new IllegalArgumentException("Unexpected value: " + dia);
        }
        int day = 1;
        switch (day){
            case 1:
            case 7:
                System.out.println("Final de semana");break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");break;

            default:
                System.out.println("Favor digitar apenas os números de 1 a 7!");
        }
    }
}
