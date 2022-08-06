package behavior;

public interface Flyer extends Mover {
    void fly();

    @Override
    default void move() {
        fly();
    }
}
