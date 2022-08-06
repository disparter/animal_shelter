import animal.Animal;
import animal.Bird;
import animal.Bulldog;
import animal.Dog;
import animal.Duck;
import animal.FrenchBulldog;
import animal.InjuredLittleDog;
import behavior.Mover;
import behavior.SoundMaker;
import nonanimal.Car;
import nonanimal.Chimera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalShelter {

    List<Animal> animais;
    List<SoundMaker> band;


    public static void main(String[] args) {
        //DADO QUE
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.animais = startAnimalShelter();
        animalShelter.band = animalShelter.startBand();

        //QUANDO
        animalShelter.sing();

        animalShelter.howManyLegsMyAnimalsHave();
        animalShelter.areTheBandMoving();


        //ENTAO
        //Cachorro vai latir e pato vai fazer quack

    }

    private void areTheBandMoving() {
        band.stream()
                .filter(musician -> musician instanceof Mover)
                .map(musician ->(Mover) musician)
                .forEach(mover -> {
                    System.out.format("Is the musician %s moving?",
                            mover.getClass().getSimpleName());
                    mover.move();
                });
    }

    private void howManyLegsMyAnimalsHave() {
        animais.forEach(animal -> System.out.format("animal.Animal %s - have  %d number of legs\n",
                animal.getClass().getSimpleName(),
                animal.legs));
    }

    private List<SoundMaker> startBand() {
        var result = new ArrayList<SoundMaker>(animais);
        result.add(new Car());
        result.add(new Chimera());
        return result;
    }

    private static List<Animal> startAnimalShelter() {
        return Arrays.asList(new Dog(),
                new Bulldog(),
                new Duck(),
                new FrenchBulldog(),
                new InjuredLittleDog(),
                new Bird());
    }

    public void sing(){
        band.forEach(musician -> System.out.format("Musician %s - said %s\n",
                musician.getClass().getSimpleName(),
                musician.sound()));
    }


}
