package services;

import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Class<Cliente> getTipoClasse();

    void atualiarDados(Cliente entity, Cliente entityCadastrado);

    Object excluir(Long id);

    Cliente consultar(Long cpf);

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    void alterar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
