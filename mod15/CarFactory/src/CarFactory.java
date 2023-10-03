public class CarFactory implements PicapeFactory {

        @Override
        public Picape createChevroletSilverado() {
            return new ChevroletSilvrado();
        }

        @Override
        public Picape createChevroletMontana() {
            return new ChevroletMontana();
        }
}
