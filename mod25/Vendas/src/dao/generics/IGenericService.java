package dao.generics;

import domain.Persistente;
import exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IGenericService<T extends Persistente> {

    /**
     * Método para cadastrar novos registros no banco de dados
     *
     * @param entity a ser cadastrado
     * @return true se cadastrado com sucesso, false caso contrário
     * @throws TipoChaveNaoEncontradaException
     */
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param valor chave única do dado a ser excluído
     * @return
     */
    Object excluir(Long valor);

    /**
     * Método para alterar um registro no banco de dados.
     *
     * @param entity a ser atualizado
     * @throws TipoChaveNaoEncontradaException
     */
    void alterar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return o registro encontrado ou null se não encontrado
     */
    T consultar(Long valor);

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinada tabela
     *
     * @return Coleção de registros encontrados
     */
    Collection<T> buscarTodos();
}

