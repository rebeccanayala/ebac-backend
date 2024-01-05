import dao.CarroDao;
import dao.ICarroDao;
import dao.IMarcaDao;
import dao.MarcaDao;
import domain.Carro;
import domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {
    private IMarcaDao marcaDao;

    private ICarroDao carroDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Carro carro = criarCarro("BMW");

        Marca marca = new Marca();
        marca.setNome("BMW");
        marca.setCarro(carro);
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }

    private Carro criarCarro(String marca) {
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setAcessorio("prata");
        return carroDao.cadastrar(carro);

    }
}
