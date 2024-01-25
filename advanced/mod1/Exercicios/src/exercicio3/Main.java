package exercicio3;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da classe MinhaListaEncadeada
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));

        lista.printlist();

        lista.pop();
        lista.printlist();

        lista.insert(1, new Node(25));
        lista.printlist();

        Node elemento = lista.elementAt(1);
        if (elemento != null) {
            System.out.println("Elemento na posição 1: " + elemento.data);
        }

        System.out.println("Tamanho da lista: " + lista.size());
    }
}
