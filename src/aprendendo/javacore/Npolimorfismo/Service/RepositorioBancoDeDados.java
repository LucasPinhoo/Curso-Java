package aprendendo.javacore.Npolimorfismo.Service;

import aprendendo.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
