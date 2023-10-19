import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void acelerarTodos() {
        for (T carro : carros) {
            carro.acelerar();
        }
    }
}


