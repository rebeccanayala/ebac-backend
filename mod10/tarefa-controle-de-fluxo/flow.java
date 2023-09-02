import java.util.Scanner;

public class Flow {   

    public static void main(String[] args) { 
        Scanner scanner = new Scanner (System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.println("Digite sua nota de português");
        nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota de matemática");
        nota2 = scanner.nextDouble();

        System.out.println("Digite sua nota de história");
        nota3 = scanner.nextDouble();

        System.out.println("Digite sua nota de geografia");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é " + media);

        if (media >= 7) {
            System.out.println("Você foi aprovado! :)");
        } else if (media == 5 && media == 6) {
            System.out.println("Você está de recuperação.");
        } else (media <= 4) {
            System.out.println("Você foi reprovado");
        }

        scanner.close();
    }
    
}