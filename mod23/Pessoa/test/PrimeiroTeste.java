import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeiroTeste {

    @Test
    public void mulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Armando", "M"));
        pessoas.add(new Pessoa("Bárbara", "F"));
        pessoas.add(new Pessoa("Carlos", "M"));
        pessoas.add(new Pessoa("Daniela", "F"));
        pessoas.add(new Pessoa("Emanuel", "M"));
        pessoas.add(new Pessoa("Fabiana", "F"));
        pessoas.add(new Pessoa("Gabriel", "M"));
        pessoas.add(new Pessoa("Helen", "F"));
        pessoas.add(new Pessoa("Irene", "F"));
        pessoas.add(new Pessoa("João", "M"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());

        assertTrue("Esta lista só tem nomes femininos.", mulheres.stream().allMatch(pessoa -> pessoa.getSexo().equals("F")));
    }

}
