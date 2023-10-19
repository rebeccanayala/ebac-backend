public class CarroSedan extends Carro{
    public CarroSedan(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro Sedan" + " " + getNome());
    }
}
