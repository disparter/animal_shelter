package behavior;

public interface Swimmer extends Mover {
    void swim();

    @Override
    default void move() {
        swim();
    }
}
