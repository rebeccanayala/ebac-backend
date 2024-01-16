package main.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.vendas.model.Produto;

@Stateless
public class ProdutoService {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Produto produto) {
        entityManager.persist(produto);
    }

    public List<Produto> listarTodos() {
        TypedQuery<Produto> query = entityManager.createQuery("SELECT p FROM Produto p", Produto.class);
        return query.getResultList();
    }
}
