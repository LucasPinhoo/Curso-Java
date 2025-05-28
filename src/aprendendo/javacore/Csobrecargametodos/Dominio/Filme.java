package aprendendo.javacore.Csobrecargametodos.Dominio;

public class Filme {
    private String nome;
    private String tipo;
    private String genero;
    private int quantidadeFilmes;

    public void init (String nome,String tipo, String genero, int quantidadeFilmes){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.quantidadeFilmes);
    }
    public String getNome(){ return this.nome; }

    public void setNome(String nome){ this.nome = nome; }

    public String getTipo(){ return this.tipo; }

    public void setTipo(String tipo){ this.tipo = tipo; }

    public String getGenero(){ return this.genero; }

    public void setGenero(String genero){ this.genero = genero; }

    public int getQuantidadeFilmes(){ return this.quantidadeFilmes; }

    public void setQuantidadeFilmes(int quantidadeFilmes){ this.quantidadeFilmes = quantidadeFilmes; }


}
