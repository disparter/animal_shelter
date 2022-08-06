public interface Dancer extends Mover {

    void dance();

    @Override
    default void move() {
        dance();
    }
}
