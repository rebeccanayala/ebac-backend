import dao.IClienteDAO;
import dao.ClientedaoMock;
import domain.Cliente;
import org.junit.Assert;
import org.junit.Test;
import services.IClienteService;
import services.ClienteService;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest() {
        IClienteDAO dao = new ClientedaoMock;
        clienteService = new ClienteService(dao) {

        };
    }

    @Test
    public void pesquisarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Bulma");
        cliente.setCidade("Cidade do Oeste");
        cliente.setEnd("Kame House");
        cliente.setEstado("Não especificado");
        cliente.setNumero(00);
        cliente.setTel(54312312312L);
    }

    clienteService.salvar(cliente);

    Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

    Assert.assertNotNull(clienteConsultado);

}
