package aprendendo.java;

public class aulinha5EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isPermitidoComprarBebida = idade >= 18;
        if (isPermitidoComprarBebida) {
            System.out.println("Permitido comprar bebida");
        }else {
            System.out.println("nao e permitido comprar bebida");
        }
        // negação sem usar "Else" ou pode usar "!"
        // if (!isPermitidoComprarBebida)
        if (isPermitidoComprarBebida == false){
            System.out.println("Não é permitido compar bebida");
        }
        boolean c = false;
        if (c = true){
            System.out.println("dentro de algo que nunca deve ser feito");
        }
        int idadeProShow = 17;
        boolean isPermitidoEntrarNoShow = idadeProShow >=18;
        if (isPermitidoEntrarNoShow){
            System.out.println("É permitido entrar no show");
        }
        if (!isPermitidoEntrarNoShow){
            System.out.println("Não é permitido entar no show! Tente novamente quando atingir a idade necessária.");
        }
        int idadePraDirigir = 19;
        boolean isPermitidoDirir = idadePraDirigir >= 18;
        if (isPermitidoDirir){
            System.out.println("Parabéns você atingiu a idade necessária para dirigir!");
        }
        if (!isPermitidoDirir){
            System.out.println("Infelizmente você não atingiu a idade permitida para dirigir. Tente novamente quando atingir a idade permitida.");
        }
        System.out.println("fora do if");
    }
}
