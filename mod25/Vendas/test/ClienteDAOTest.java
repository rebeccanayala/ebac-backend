import dao.ClienteDAOMock;
import dao.IClienteDAO;
import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAOMock();
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
        clienteDao.cadastrar(cliente);
    }

    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDao.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Bulma Brief");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Bulma Brief", cliente.getNome());
    }
}
