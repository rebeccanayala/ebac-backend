package dao;

import domain.Cliente;

import java.util.List;

public interface IClienteDAO {

    Integer cadastrar(Cliente cliente) throws Exception;

    public Integer atualizar(Cliente cliente) throws Exception;

    public Cliente buscar(String codigo) throws Exception;

    public List<Cliente> buscarTodos() throws Exception;

    Integer excluir(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;
}