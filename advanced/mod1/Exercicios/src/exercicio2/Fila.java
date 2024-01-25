package exercicio2;

public class Fila {
    private int[] array;
    private int tamanho;
    private int capacidade;


    public Fila(int capacidade) {
        array = new int[capacidade];
        tamanho = 0;
        this.capacidade = capacidade;
    }

    // Método que verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Método que verifica se a fila está cheia
    public boolean isFull() {
        return tamanho == capacidade;
    }

    // Método que obtêm o tamanho da fila
    public int size() {
        return tamanho;
    }

    // Método que adiciona um inteiro ao final da fila
    public void enqueue(int elemento) {
        if (!isFull()) {
            array[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Não é possível adicionar elementos.");
        }
    }

    // Método que remove o inteiro da frente da fila e o retorna
    public int dequeue() {
        if (!isEmpty()) {
            int elementoRemovido = array[0];

            for (int i = 0; i < tamanho - 1; i++) {
                array[i] = array[i + 1];
            }

            tamanho--;
            return elementoRemovido;
        } else {
            System.out.println("Não há elementos para remover.");
            return -1;
        }
    }

    // Método que retorna o inteiro que está no fim da fila
    public int rear() {
        if (!isEmpty()) {
           return array[tamanho -1];
        } else {
            System.out.println("Não há elementos no fim da fila.");
            return -1;
        }
    }

    // Método que retorna o inteiro que está na frente da fila
    public int front() {
        if (!isEmpty()) {
            return array[0];
        } else {
            System.out.println("A fila está vazia. Não há elementos na frente.");
            return -1;
        }
    }






}
