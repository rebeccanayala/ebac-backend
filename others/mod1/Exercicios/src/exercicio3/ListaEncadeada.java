package exercicio3;

public class ListaEncadeada {
    private Node head;

    // Adiciona um nó ao fim da lista encadeada
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

   // Remove o nó no fim da lista encadeada e retorna o mesmo
   public Node pop() {
       if (head == null) {
           return null;  // Lista vazia
       }

       Node current = head;
       Node previous = null;

       while (current.next != null) {
           previous = current;
           current = current.next;
       }

       if (previous == null) {
           // Único nó na lista
           head = null;
       } else {
           previous.next = null;
       }

       return current;
   }

    // Adiciona um nó na posição indicada pelo índice
    public void insert(int index, Node node) {
        if (index < 0) {
            System.out.println("Índice inválido");
            return;
        }

        if (index == 0) {
            // Adiciona no início da lista
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    System.out.println("Índice inválido");
                    return;
                }
                current = current.next;
            }

            if (current == null) {
                System.out.println("Índice inválido");
                return;
            }

            node.next = current.next;
            current.next = node;
        }
    }

    // Retorna o elemento que está no índice indicado
    public Node elementAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                System.out.println("Índice inválido");
                return null;
            }
            current = current.next;
        }
        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Imprime a representação textual da lista
    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
