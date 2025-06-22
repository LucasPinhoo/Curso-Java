package aprendendo.javacore.Npolimorfismo.Service;

import aprendendo.javacore.Npolimorfismo.Repositorie.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
