public class Main {
    public static void main(String[] args) {
        ListaDeCarros<Carro> lista = new ListaDeCarros<>();

        CarroEsportivo esportivo = new CarroEsportivo("Lamborghini");
        CarroSedan sedan = new CarroSedan("Corolla");
        SUV suv = new SUV("T-Cross");

        lista.adicionarCarro(esportivo);
        lista.adicionarCarro(sedan);
        lista.adicionarCarro(suv);

        lista.acelerarTodos();
    }
}
