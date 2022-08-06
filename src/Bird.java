public class Bird extends Animal implements Walker,Flyer,Dancer,SoundMaker {


    public Bird(){legs = 2;}

    @Override
    public void dance() {
        System.out.println("I can dance as well");

    }

    @Override
    public void fly() {
        System.out.println("I can fly as well");

    }

    @Override
    public void walk() {
        System.out.println("I can Walk as well");

    }

    @Override
    public void move(){
        if(System.currentTimeMillis() % 3 == 0) {
            fly();
        }else if (System.currentTimeMillis() % 2 == 0){
            walk();
        }else {
            dance();
        }
    }

    @Override
    public String sound() {return "sing";}

}

