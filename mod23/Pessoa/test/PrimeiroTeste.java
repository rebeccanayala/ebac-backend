import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeiroTeste {

    @Test
    public void mulheres() {
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());

        assertTrue("Esta lista só tem nomes femininos.", mulheres.stream().allMatch(pessoa -> pessoa.getSexo().equals("F")));
    }

}
