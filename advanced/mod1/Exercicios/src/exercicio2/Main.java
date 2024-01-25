package exercicio2;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Frente da fila " + fila.front());
        System.out.println("Fim da fila " + fila.rear());
        System.out.println("Tamanho da fila " + fila.size());

        System.out.println("Removido da fila da fila " + fila.dequeue());
        System.out.println("Frente da fila " + fila.size());




    }
}
