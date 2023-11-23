package dao;

import domain.Cliente;

public class ClientedaoMock implements IClienteDAO{

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void salvar(Cliente cliente) {

    }
}
