package dao;

import domain.Cliente;

public interface IClienteDAO {

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
