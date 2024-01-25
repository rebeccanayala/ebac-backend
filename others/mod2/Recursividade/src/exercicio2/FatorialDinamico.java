package exercicio2;

import java.util.HashMap;

public class FatorialDinamico {

    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int numero = 7;

        long resultadoTopDown = calcularFatorialTopDown(numero);
        long resultadoBottomUp = calcularFatorialBottomUp(numero);

        System.out.println("Top-down: " + resultadoTopDown);
        System.out.println("Bottom-up: " + resultadoBottomUp);
    }

    private static long calcularFatorialTopDown(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long resultado = n * calcularFatorialTopDown(n - 1);
        memo.put(n, resultado);
        return resultado;
    }

    private static long calcularFatorialBottomUp(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }
}
