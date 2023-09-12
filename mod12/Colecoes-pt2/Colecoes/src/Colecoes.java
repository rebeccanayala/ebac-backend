import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome - ou 'sair' para encerrar");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
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
