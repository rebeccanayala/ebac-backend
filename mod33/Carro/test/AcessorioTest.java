import dao.*;
import domain.Acessorio;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AcessorioTest {
    private IAcessorioDao acessorioDao;

    private ICarroDao carroDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Carro carro = criarCarro("prata");

        Acessorio acessorio = new Acessorio();
        acessorio.setCor("prata");
        acessorio.setCarro(carro);
        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }

    private Carro criarCarro(String acessorio) {
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setAcessorio("prata");
        return carroDao.cadastrar(carro);

    }
}
