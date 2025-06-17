package aprendendo.javacore.Kenum.Test;

import aprendendo.javacore.Kenum.Domain.Cliente;
import aprendendo.javacore.Kenum.Domain.TipoCliente;
import aprendendo.javacore.Kenum.Domain.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vincent", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Sephiroth", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);


    }
}
