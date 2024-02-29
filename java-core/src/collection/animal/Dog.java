package collection.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);

    }

    public static Dog of(String name, Integer weight) {
        return new Dog(name, weight);
    }


    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - currentPosition;
        runForward(delta);
    }

    public void whereRheDog() {
        System.out.println("Current position: " + currentPosition);
    }

    public static Dog ofHomeless(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(Dog.of("Sharik", 10));
        dogs.add(Dog.of("Bobik", 17));
        dogs.add(Dog.of("Tuzik", 11));


        return dogs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
