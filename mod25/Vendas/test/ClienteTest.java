import domain.Cliente;
import org.junit.Test;
import services.IClienteService;

public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest(IClienteService clienteService) {
        this.clienteService = clienteService;
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
}
