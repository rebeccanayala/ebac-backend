public abstract class Carro {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void acelerar();
}
