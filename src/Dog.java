public class Dog extends Animal{

    public Dog(){
        legs = 4;
    }

    @Override
    public String sound() {
        return "barf";
    }
}
