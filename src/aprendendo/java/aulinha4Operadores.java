package aprendendo.java;

public class aulinha4Operadores {
    public static void main(String[] args) {
        // operadores + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println("O valor é: "+resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > / <= >= / ==  comparação / != diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        boolean isDezMaiorOuIgualAVinte = 10 >= 20;
        System.out.println("isDezMaiorOuIgualAVinte "+isDezMaiorOuIgualAVinte);
        boolean isDezIgualADez = 10 == 10;
        System.out.println("isDezIgualADez "+isDezIgualADez);
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // && (AND) / || (OR) / !
        int idade = 29;
        float salario = 4200f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4620;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        int idade1 = 30;
        float salario1 = 4200f;
        boolean isSalarioDentroDaLei = idade1 >= 30 && salario1 >= 4000;
        boolean isSalarioForaDaLei = idade1 < 30 && salario1 >= 3000;
        System.out.println("Está dentro da lei "+isSalarioDentroDaLei);
        System.out.println("Está fora da lei "+isSalarioForaDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationFiveCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationFiveCompravel "+isPlaystationFiveCompravel);

        // = / += / -= / *= / "/=" / %=
        double bonus = 1800; // 1800
        bonus += 1000; // 1000
        bonus -= 200; // 2600
        bonus *= 2; // 5200
        bonus /= 2; // 2600
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);


    }
}
