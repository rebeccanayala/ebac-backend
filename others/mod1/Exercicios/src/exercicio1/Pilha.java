package exercicio1;

public class Pilha {
    private int[] array;
    private int tamanho;

    public Pilha(int capacidade) {
        array = new int[capacidade];
        tamanho = 0;
    }

    // Método que verifica se a pilha está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Método que obtêm o tamanho atual da pilha
    public int size() {
        return tamanho;
    }

    // Método para adicionar um inteiro no topo da pilha
    public void push(int elemento) {
        if (tamanho < array.length) {
            array[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Não é possível adicionar elementos");
        }
    }

    // Método para remover o valor do topo da pilha e retorná-lo
    public int pop() {
        if (!isEmpty()) {
            tamanho--;
            return array[tamanho];
        } else {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return -1;
        }
    }

    // Método para espiar o valor no topo da pilha sem removê-lo
    public int top() {
        if (!isEmpty()) {
            return array[tamanho - 1];
        } else {
            System.out.println("A pilha está vazia. Não há elementos para espiar.");
            return -1;
        }
    }

}
