package dao;

import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO{


    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public Object excluir(Long valor) {

        return null;
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
