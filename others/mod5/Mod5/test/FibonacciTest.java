import exercicio2.Fibonacci;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciCinco() {
        assertEquals(5, Fibonacci.fibonacci(5), Fibonacci.fibonacci(5));
    }

    @Test
    public void testFibonacciDez() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }
}
