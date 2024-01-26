package exercicio1;

import java.util.ArrayList;

public class Subconjuntos {
    public static void main(String[] args) {
        int[] conjunto1 = {1, 2, 3};
        int n1 = 2;

        int[] conjunto2 = {1, 2, 3, 4};
        int n2 = 1;

        imprimirSubconjuntos(gerarSubconjuntos(conjunto1, n1));
        imprimirSubconjuntos(gerarSubconjuntos(conjunto2, n2));
    }

    public static ArrayList<ArrayList<Integer>> gerarSubconjuntos(int[] conjunto, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        gerarSubconjuntosAux(conjunto, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void gerarSubconjuntosAux(int[] conjunto, int n, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == conjunto.length) {
            return;
        }

        current.add(conjunto[index]);
        gerarSubconjuntosAux(conjunto, n, index + 1, current, result);

        current.remove(current.size() - 1);
        gerarSubconjuntosAux(conjunto, n, index + 1, current, result);
    }

    public static void imprimirSubconjuntos(ArrayList<ArrayList<Integer>> subconjuntos) {
        for (ArrayList<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }



}
