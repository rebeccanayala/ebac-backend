public class Wrapper {   

    public static void main(String[] args) { 
        mediaAritmetica();
    }

    private static void mediaAritmetica() {
        int nota1 = 8;     
        int nota2 = 2;
        double nota3 = 8.5;
        double nota4 = 10;
        double soma = nota1 + nota2 + nota3 + nota4;
        double resultado = soma / 4;

        System.out.println(resultado);
    }
}