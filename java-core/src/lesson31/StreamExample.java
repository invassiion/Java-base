package lesson31;

import collection.animal.Animal;
import collection.animal.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void run() {
        System.out.println("Stream Example");
        List<Integer> list = List.of(1,2,3,4,5,6);
        System.out.println(getEvenNumber(list));
        System.out.println(getEvenNumberWithStreamApi(list));
        workWithNumbers();
        workWithString();
        workWithObjects();
    }

    public static List<Integer> getEvenNumber(List<Integer> input) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : input) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }


    public static List<Integer> getEvenNumberWithStreamApi(List<Integer> input) {
        return input.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void workWithNumbers() {
        System.out.println();
        System.out.println("workWithNumbers");
        List<Integer> numbers = List.of(1, -1, -8, 11, 22, 33, 44);
        numbers.stream()
                .filter(num -> num > 0)
                .forEach(num -> {
                    System.out.println(num);
                });

        int result = numbers.stream()
                .filter(n -> n > 0)
                .min((x, y) -> Integer.compare(x, y))
                .orElse(0);
        System.out.println("result: " + result);

        int sum = numbers.stream()
                .reduce((x,y) -> x + y)
                .orElse(0);
        System.out.println("sum: " + sum);

    }


    private static void workWithString() {
        System.out.println();
        System.out.println("workWithString");

        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patrik", "");

        System.out.println(names);
        names = names.stream()
                .filter(s -> s.isBlank() == false)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("names:" + names);

        long amount = names.stream()
                .filter(s -> s.startsWith("P"))
                .collect(Collectors.counting());
        System.out.println("count:" +  amount);
    }

    private static void workWithObjects() {
        System.out.println();
        System.out.println("workWithObjects");

        List<Dog> dogs = List.of(
                Dog.of("Sharik" ,new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Bobik" ,new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Brobik" ,new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
                Dog.of("Tuzik" ,new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG))
        );

        Map<String, List<Dog>> dogMap = dogs.stream()
                .collect(Collectors.groupingBy(
                        dog -> String.valueOf(dog.getName().charAt(0)),Collectors.toList()
                ));
        System.out.println(dogMap);
    }

}
