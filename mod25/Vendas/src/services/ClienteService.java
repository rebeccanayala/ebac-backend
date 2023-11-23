package services;

import dao.IClienteDAO;
import domain.Cliente;

public class ClienteService implements IClienteService {
    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    public ClienteService(IClienteDAO dao) {
        super();
    }

    @Override
    public Object excluir(Long id) {
        // Implementação da exclusão, se necessário.
        return null;
    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return null;
    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }





    /*private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }*/
}
