package behavior;

public interface Walker extends Mover {
    void walk();

    @Override
    default void move() {
        walk();
    }
}
