public class InjuredLittleDog extends Dog {
    public InjuredLittleDog(){
        legs = 3;
    }

    @Override
    public void walk() {
        System.out.println("I can walk, but I'm slow.");
    }
}
