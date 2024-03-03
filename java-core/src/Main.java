import Enums.Day;
import Lesson24.TypeConversion;
import collection.animal.*;
import lesson16.SwitchExample;
import lesson23.StringExample;
import lesson28.AnonExample;
import lesson30.LambdaExample;
import lesson31.StreamExample;
import lesson32.MyFirstThread;
import lesson33.TaskExample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Colletions
//        Animal animal = new Animal();
//        animal.runForward(50);
//
//        Dog dog = new Dog();
//        Dog homelessDog = Dog.ofHomeless(10);

        List<Dog> dogHomeles = Arrays.asList(new Dog[]{
                Dog.ofHomeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG)),
        });
        System.out.println(dogHomeles.size());
        System.out.println(dogHomeles.get(0));
        System.out.println(dogHomeles.get(1));
        System.out.println(dogHomeles.get(2));
        System.out.println(dogHomeles.get(3));

        System.out.println("");

        List<Dog> dogs = Dog.randomArray();
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));

//        Map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        System.out.println("=======================");
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");

        System.out.println("arrayList size: " + arrayList.size());
        System.out.println("Is arrayList empty? " + arrayList.isEmpty());
        System.out.println(arrayList);
        if (arrayList.contains("banana")) {
            System.out.println("ArrayList contains banana.");
        }
        arrayList.remove("cherry");
        System.out.println("arrayList after removal: " + arrayList);
        System.out.println("=======================");
        System.out.println("=======================");

//        LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");


        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("Is linkedList empty? " + linkedList.isEmpty());
        System.out.println(linkedList);

        if (linkedList.contains("banana")) {
            System.out.println("ArrayList contains banana.");
        }

        linkedList.remove("cherry");
        System.out.println("linkedList after removal: " + linkedList);
        System.out.println("=======================");

//        Set
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); // Дубликат добавлен не будет

        System.out.println("Set size: " + set.size());
        System.out.println("is set empty? " + set.isEmpty());
        System.out.println("set: " + set);

        if (set.contains("banana")) {
            System.out.println("set contains banana");
        }
        set.remove("cherry");
        System.out.println("set after removal: " + set);
        System.out.println("=======================");


//      Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println("queue size: " + queue.size());
        System.out.println("is queue empty? " + queue.isEmpty());
        System.out.println("queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("polling: " + queue.poll());
        }
        System.out.println("is queue empty? " + queue.isEmpty());


//        Lesson 16 Switch

//        System.out.println("=======================");
//        for (int i = 0; i < 3; i++) {
//            SwitchExample.run();
//        }
//        System.out.println("=======================");

//        Lesson 17
//        Animal animal1 = new Animal();
//        animal1.voice();

//Lesson 20 - equals & hashcode
        System.out.println("=======================");
        Dog dogSharik = new Dog("Sharik",new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG));
        Dog dogSharik1 = new Dog("Sharik",new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG));
        Dog dogBobik = new Dog("Bobik",new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG));

        System.out.println("Operation == return: " + (dogSharik == dogSharik));
        System.out.println("Operation == return: " + (dogSharik == dogBobik));
        System.out.println("Operation == return: " + (dogSharik == dogSharik1));

        System.out.println("");
        System.out.println("Operation equals return: " + (dogSharik.equals(dogSharik)));
        System.out.println("Operation equals return: " + (dogSharik.equals(dogBobik)));
        System.out.println("Operation equals return: " + (dogSharik.equals(dogSharik1)));
        System.out.println("=======================");


//        Enums
        for (Day day : Day.values()) {
            System.out.println(day);
        }
        int ordinal = Day.WEDNESDAY.ordinal();
        System.out.println("Порядковый номер: " + ordinal);
        int comparison = Day.MONDAY.compareTo(Day.FRIDAY);
        System.out.println(comparison);
        System.out.println("=======================");


// Lesson 21 - Enums
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(cat.getMoveType());


        if (dog.getMoveType() == MoveType.WALK) {
            System.out.println("Может ходить");
        }

        System.out.println("=======================");
// Lesson 23- String
        StringExample.run();

        System.out.println("=======================");
//        Lesson 240 TypeConversion
        TypeConversion.run();
        System.out.println("=======================");
//        Lesson 28 - Anonimous class
        AnonExample.run();
        System.out.println("=======================");

//        Lesson 29 - Exceptions
        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
        try{
            dog.setWeight(new Animal.AnimalWeight(-10, Animal.AnimalWeight.WeightType.KG));
        } catch (Animal.WeightException e) {
            System.out.println("some Error");
        }

        System.out.println("=======================");
//        Lesson 30 lambda
        LambdaExample.run();

        System.out.println("=======================");
//        Lesson 31 Stream Api
        StreamExample.run();

        System.out.println("=======================");
//        Lesson 32 Thread
        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();


//        MyFirstThread.showThreads();
//        MyFirstThread.showThreads();
//        MyFirstThread.showThreads();
//        MyFirstThread.showThreads();
//        MyFirstThread.showThreads();

//        Lesson 33 Tasks
        TaskExample.run();

    }

    }
