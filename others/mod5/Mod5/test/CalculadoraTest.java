import exercicio1.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.adicionar(2, 3));
    }
}
