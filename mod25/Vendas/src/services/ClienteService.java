package services;

import dao.IClienteDAO;
import dao.generics.GenericService;
import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;

public class ClienteService extends GenericService<Cliente> implements IClienteService{
    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return null;
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
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }*/
}
