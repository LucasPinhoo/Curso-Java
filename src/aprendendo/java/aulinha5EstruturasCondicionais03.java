package aprendendo.java;

public class aulinha5EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 4000;
        String mensagemDoar = "Vou doar 500.";
        String mensagemNaoDoar = "Não vou conseguir doar.";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        double dinheiro = 1417;
        String comprarCastlevania = "Vou comprar Castlevania";
        String naoComprarCastlevania = "Não vou comprar Castlevania";
        String conclusao = dinheiro > 32 ? comprarCastlevania : naoComprarCastlevania;
        System.out.println(conclusao);
    }
}
