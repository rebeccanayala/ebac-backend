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

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome - ou 'fim' para encerrar");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o sexo - M para MASCULINO, F para FEMININO): ");
            char sexo = scanner.nextLine().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Valor inválido.");
            }
        }

        System.out.println("HOMENS:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("MULHERES:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
        
    }
}
