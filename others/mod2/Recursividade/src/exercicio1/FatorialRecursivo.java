package exercicio1;

public class FatorialRecursivo {
    public static void main(String[] args) {
      int numero = 4;
      long resultado = calcularFatorial(numero);

        System.out.println(resultado);
    }

    private static long calcularFatorial(int n) {
        if (n == 0  || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n -1);
        }
    }
}
