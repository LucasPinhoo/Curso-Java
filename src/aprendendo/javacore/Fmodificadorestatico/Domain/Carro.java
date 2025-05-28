package aprendendo.javacore.Fmodificadorestatico.Domain;
// Aula de metodos estaticos, provavelmente vamos ver muito isso.
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    // midificador de acesso estatico faz o atributo pertencer a classe
    // e todos os objetos vão compartilhar do mesmo valor.
    // ou seja se for alterar através de uma estancia você não vai estár alterando de uma estancia,
    // você está alterando pra todos os objetos em existencia da classe, que nesse caso a classe "Carro"

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;


    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println(" Nome "+this.nome);
        System.out.println(" Velocidade Maxima "+this.velocidadeMaxima);
        System.out.println(" Velocidade Limite " + this.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){return velocidadeLimite;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
