package aprendendo.javacore.Fmodificadorestatico.Domain;
//aula de blocos de inicialização estatico, provavelmente não se usa muito
public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executada quando a JVM carregar as classes
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static{
        System.out.println("Dentro do bloco de inicialização estático 1 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static{
        System.out.println("Dentro do bloco de inicialização  estático 2 ");

    }
    static{
        System.out.println("Dentro do bloco de inicialização estático 3 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático ");
        // É repitido na quantidade de vezes em que estamos criando
        // ou seja vai se repetir 3 vezes junto com os episodios se não colocar o "static" antes
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
