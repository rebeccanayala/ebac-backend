package exercicio1;

public class Calculadora {

    public int adicionar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar (int a, int b) {
        return a * b;
    }

    public int dividir (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não se pode dividir por zero.")
        }
        return a / b;
    }
}
