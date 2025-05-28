package aprendendo.java;

//switch
public class aulinha5EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 8;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            // se usa "default" caso não atinja nenhuma das opções!
            default:
                System.out.println("São apenas sete (7) dias da semana. Favor escolher apenas uma (1)");
        }

        char sexo = 'F';
        switch (sexo) {
            case 'M':
            case 'm':
                System.out.println("sexo masculino");
                break;
            case 'F':
            case 'f':
                System.out.println("sexo feminino");
                break;
            default:
                System.out.println("opcao indisponivel!");
                break;
        }
    }


}
