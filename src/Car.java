public class Car implements SoundMaker, Mover {
    @Override
    public String sound() {
        return "horn";
    }

    @Override
    public void move() {
        System.out.println("I can move!");
    }
}
