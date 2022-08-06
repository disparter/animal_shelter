package nonanimal;

import behavior.Flyer;
import behavior.SoundMaker;
import behavior.Walker;

public class Chimera implements Flyer, Walker, SoundMaker {
    @Override
    public void fly() {
        System.out.println("I can Fly");
    }

    @Override
    public void walk() {
        System.out.println("I can Walk as well");
    }

    @Override
    public void move() {
        if(System.currentTimeMillis() % 2 == 0) {
            fly();
        }else {
            walk();
        }
    }

    @Override
    public String sound() {
        return "Roar";
    }
}
