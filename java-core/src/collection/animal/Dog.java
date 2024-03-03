package collection.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog extends Animal {
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);

    }

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }


    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - currentPosition;
        runForward(delta);
    }

    public void whereRheDog() {
        System.out.println("Current position: " + currentPosition);
    }

    public static Dog ofHomeless(AnimalWeight weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(Dog.of("Sharik", new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Bobik", new Animal.AnimalWeight(17, Animal.AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Tuzik", new Animal.AnimalWeight(11, Animal.AnimalWeight.WeightType.KG)));


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

    @Override
    public void voice() {
        System.out.println("WOf WOF");
    }
}
