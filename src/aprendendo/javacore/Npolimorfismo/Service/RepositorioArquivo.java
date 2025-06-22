package aprendendo.javacore.Npolimorfismo.Service;

import aprendendo.javacore.Npolimorfismo.Repositorie.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
