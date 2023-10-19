public class SUV  extends Carro{
    public SUV(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro SUV" + " " + getNome());
    }
}
