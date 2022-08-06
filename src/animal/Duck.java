package animal;

import behavior.Flyer;
import behavior.Swimmer;
import behavior.Walker;

public class Duck extends Animal implements Flyer, Walker, Swimmer {

    public Duck(){
        legs = 2;
    }

    @Override
    public String sound() {
        return "Qua";
    }

    @Override
    public void fly() {
        System.out.println("I can fly as well");
    }

    @Override
    public void swim() {
        System.out.println("I can swim as well");
    }

    @Override
    public void walk() {
        System.out.println("I can walk as well");
    }

    @Override
    public void move() {
        if(System.currentTimeMillis() % 3 == 0) {
            fly();
        }else if (System.currentTimeMillis() % 2 == 0){
            walk();
        }else {
            swim();
        }
    }
}
