import java.util.Scanner;

public class wrapper {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um valor inteiro:");
        int intNumber = scanner.nextInt();

        Integer integerWrapper = Integer.valueOf(intNumber);

        System.out.println(integerWrapper + " foi o valor que você digitou." );

        scanner.close();
    }
}