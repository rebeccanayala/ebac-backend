import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {

    public static void main(String[] args) {
        Tarefa1();
        Tarefa2();

    }

    private static void Tarefa1() {
        System.out.println("Tarefa 1:");
        List<String> nomes = new ArrayList<>();
        nomes.add("Renata");
        nomes.add("Suzana");
        nomes.add("Carla");
        nomes.add("Marli");
        nomes.add("Zilda");

        Collections.sort(nomes);

        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
            System.out.println(nome);
        }
    }

    private static void Tarefa2() {
        System.out.println("Tarefa 2:");
        
    }
}
