package aprendendo.javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){
        System.out.println("--------");

        estudante.nome = "Gohan";
        // aula 51
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
