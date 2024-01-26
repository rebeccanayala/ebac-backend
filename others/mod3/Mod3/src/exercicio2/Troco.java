package exercicio2;

public class Troco {

    public static void main(String[] args) {
        int quantia = 133;
        int[] moedas = {5, 3, 1};

        calcularTroco(quantia, moedas);
    }

    public static void calcularTroco(int quantia, int[] moedas) {
        System.out.println("Troco com o menor número de moedas:");

        for (int moeda : moedas) {
            int quantidadeMoedas = quantia / moeda;
            quantia %= moeda;

            if (quantidadeMoedas > 0) {
                System.out.println(quantidadeMoedas + " moedas de " + moeda);
            }
        }
    }
}
