package aprendendo.javacore.Jmodificadorfinal.Test;

import aprendendo.javacore.Jmodificadorfinal.Domain.Carro;
import aprendendo.javacore.Jmodificadorfinal.Domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
