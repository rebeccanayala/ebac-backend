import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import services.ClienteService;
import services.IClienteService;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;
    private IClienteService clienteDao;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Bulma");
        cliente.setCidade("Cidade do Oeste");
        cliente.setEnd("Kame House");
        cliente.setEstado("Não especificado");
        cliente.setNumero(00);
        cliente.setTel(54312312312L);
        clienteService.cadastrar(cliente);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}