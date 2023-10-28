import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Tabela tabela = pessoa.getClass().getAnnotation(Tabela.class);

        if (tabela != null) {
            System.out.println("O nome da tabela é" + tabela.nome());
        } else {
            System.out.println("A classe não possui a annotation.");
        }
    }
}
