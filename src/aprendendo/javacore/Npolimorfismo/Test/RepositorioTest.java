package aprendendo.javacore.Npolimorfismo.Test;

import aprendendo.javacore.Npolimorfismo.Repositorie.Repositorio;
import aprendendo.javacore.Npolimorfismo.Service.RepositorioBancoDeDados;
import aprendendo.javacore.Npolimorfismo.Service.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Jerry Maguire");
        list.add("Joe Black");
        System.out.println(list);
    }
}
