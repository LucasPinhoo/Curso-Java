package aprendendo.java;

public class aulinha02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, boolean
        int boyage = 10;
        System.out.println("A idade do meu filho é: "+boyage+ " anos");
        int girlage = 15;
        System.out.println("A idade da minha filha é: "+girlage+" anos");
        // se utiliza o " + "
        long numerogrande = 100000l;
        double salariodouble = 2000;
        float salariofloat = 2500.0F;
        byte idadebyte = -128;
        short idadeshort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Lucas";
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("Olá meu nome é "+nome);
    }
}
