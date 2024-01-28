import exercicio1.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.adicionar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtrair(4, 3) );
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3) );
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(6, 3) );
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}
