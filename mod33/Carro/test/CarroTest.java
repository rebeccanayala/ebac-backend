import dao.CarroDao;
import dao.ICarroDao;
import domain.Carro;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setAcessorio("prata");
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
