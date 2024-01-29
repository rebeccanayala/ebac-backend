package exercicio1;

/* Classe que representa uma calculadora simples. */
public class Calculadora {


    /* Realiza a adição de dois números inteiros.*/
    public int adicionar(int a, int b) {
        return a + b;
    }

    /* Realiza a subtração de dois números inteiros.*/
    public int subtrair(int a, int b) {
        return a - b;
    }

    /* Realiza a multiplicação de dois números inteiros.*/
    public int multiplicar (int a, int b) {
        return a * b;
    }

    /* Realiza a divisão de dois números inteiros.*/
    public int dividir (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não se pode dividir por zero.");
        }
        return a / b;
    }
}
