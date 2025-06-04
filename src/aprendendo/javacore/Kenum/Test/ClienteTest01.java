package aprendendo.javacore.Kenum.Test;

import aprendendo.javacore.Kenum.Domain.Cliente;
import aprendendo.javacore.Kenum.Domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vincent", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Vincent", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Vincent", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Vincent", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
