package aprendendo.javacore.Npolimorfismo.Service;

import aprendendo.javacore.Npolimorfismo.Repositorie.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
