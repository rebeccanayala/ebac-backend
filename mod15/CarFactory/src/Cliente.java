public class Cliente {
    public static void main(String[] args) {
        PicapeFactory chevroletFactory = new CarFactory();

        Picape silverado = chevroletFactory.createChevroletSilverado();
        silverado.info();

        Picape montana = chevroletFactory.createChevroletMontana();
        montana.info();
    }
}
