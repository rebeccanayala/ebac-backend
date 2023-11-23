import dao.IClienteDAO;
import dao.ClienteDAOMock;
import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.IClienteService;
import services.ClienteService;
import domain.Cliente;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService() {

        };
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Bulma");
        cliente.setCidade("Cidade do Oeste");
        cliente.setEnd("Kame House");
        cliente.setEstado("Não especificado");
        cliente.setNumero(00);
        cliente.setTel(54312312312L);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Bulma Brief");
        clienteService.alterar(cliente);

        Assert.assertEquals("Bulma Brief", cliente.getNome());
    }

}
