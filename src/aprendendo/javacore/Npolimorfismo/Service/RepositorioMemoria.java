package aprendendo.javacore.Npolimorfismo.Service;

import aprendendo.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
