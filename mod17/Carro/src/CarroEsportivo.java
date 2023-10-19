public class CarroEsportivo extends Carro {
    public CarroEsportivo(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro Esportivo" + " " +  getNome());
    }
}
