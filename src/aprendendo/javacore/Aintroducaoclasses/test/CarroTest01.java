package aprendendo.javacore.Aintroducaoclasses.test;

import aprendendo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nomeCarro = "Astro Martin";
        carro1.modeloCarro = "Vantage";
        carro1.anoCarro = 2017;
        System.out.println("Nome do carro: " + carro1.nomeCarro + ". Modelo do carro: " + carro1.modeloCarro + ". Ano do carro: " + carro1.anoCarro);
        System.out.println("-----------------------------------------------------------------------");
        carro2.nomeCarro = "BMW";
        carro2.modeloCarro = "M3 Competition";
        carro2.anoCarro = 2017;
        System.out.println("Nome do carro: " + carro2.nomeCarro + ". Modelo do carro: " + carro2.modeloCarro + ". Ano do carro: " + carro2.anoCarro);
    }
}
