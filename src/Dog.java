public class Dog extends Animal implements Walker {

    public Dog(){
        legs = 4;
    }

    @Override
    public String sound() {
        return "barf";
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

}
