package lesson33;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaskExample {

    public static void run() {
//        runSquare();
//        runIsEven();
//        runFactorial();
//        runFarengateConverter();
//        runMaxInArray();
//        runReverseString();
//        runPalindrom();
//        runRandomGame();
//        runSumOfinterval();
        runIsSimple();
    }


    private static void runSquare() {
        System.out.println("runSquare");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х");
        int x = scanner.nextInt();

        System.out.println("Введите y");
        int y = scanner.nextInt();

        int sum = x * y;
        System.out.println(sum);

    }

    private static void runIsEven() {
        System.out.println();
        System.out.println("runIsEven");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        System.out.println(scanner.nextInt() % 2 == 0 ? "Число четное " : "Число нечетное");

    }

    private static void runFactorial() {
        System.out.println();
        System.out.println("runFactorial");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int s = scanner.nextInt();
        int f = 1;

        for (int i = 1; s > i; i++) {
            f = f * (i + 1);
        }
        System.out.println(f);
    }


    private static void runFarengateConverter() {
//            F = (C × 1.8) + 32
        System.out.println();
        System.out.println("runFarengateConverter");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (градусы по Цельсию) ");
        double c = scanner.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Градусы по Фаренгейту: " + Math.round(f));

    }


    private static void runMaxInArray() {
        System.out.println();
        System.out.println("runMaxInArray");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Массив, Чтобы найти максимальное число введите 0");

        List<Integer> list = new ArrayList<>();

//        while (true) {
//            Integer input = scanner.nextInt();
//            if (list.size() ==  5) {
//               break;
//            }
//            list.add(input);
//        }
        while (true) {

            Integer input = scanner.nextInt();
            list.add(input);

        if (input == 0) {

            System.out.println("ArrayList = ");
            for (Integer i : list) {
                System.out.println(i);
            }


           int max =  list.stream()
                    .filter(n -> n > 0)
                    .max((x,y) -> Integer.compare(x,y) )
                    .orElse(0);
            System.out.println(max);
        }
        }
    }


    private static void runReverseString() {
        System.out.println();
        System.out.println("runMaxInArray");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
    }


    private static void runPalindrom() {
        System.out.println();
        System.out.println("runMaxInArray");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
        System.out.println(str.equals(stringBuilder.toString()) ? "Эта строка является палиндромом" : "Эта строка не является палиндромом");
    }

    private static void runRandomGame() {
        System.out.println();
        System.out.println("runRandomGame");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Я загадал число от 1 до 10. Попробуй угадай!");
            Random random = new SecureRandom();
            int prime = random.nextInt(10);
            int userPrime = scanner.nextInt();
            switch (userPrime) {
                case 0:
                    System.out.println("Я же сказал от 1 до 10!");
                    break;
                case 1:
                    if (prime == 1) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 2:
                    if (prime == 2) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 3:
                    if (prime == 3) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 4:
                    if (prime == 4) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 5:
                    if (prime == 5) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 6:
                    if (prime == 6) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 7:
                    if (prime == 7) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 8:
                    if (prime == 8) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 9:
                    if (prime == 9) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                case 10:
                    if (prime == 10) {
                        System.out.println("Вау, ты угадал! Поздравляю");
                    } else {
                        System.out.println("К сожалению, это не то число, которое я загадал...(");
                    }
                    break;
                default:
                    System.out.println("Ты по-моему перепутал)");
                    break;

            }
            System.out.println("Сыграем еще? 1 - да 0 - нет");
        } while (scanner.nextInt() == 1);

    }


    private static void runSumOfinterval() {
        System.out.println();
        System.out.println("runSumOfinterval");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи  интервал, а я посчитаю сумму чисел в нем");
        do {
            System.out.println("Введи начало интервала");
            int x = scanner.nextInt();
            System.out.println("Введи конец интервала");
            int y = scanner.nextInt();
            int sum = 0;
            for (int i = x; i <= y; i++){
                 sum = sum + i;

            }
            System.out.println("Сумма чисел в данном интервале: " + sum);
            System.out.println("");
            System.out.println("Еще раз? 1 - да, 0 - нет");
        } while (scanner.nextInt() == 1);
    }


    private static void runIsSimple() {
        System.out.println();
        System.out.println("runIsSimple");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введи число, а я проверю является ли оно простым");
            String noSimple = "Это не простое число";
            String simple = "Это простое число";
            int x = scanner.nextInt();
            boolean b = true;
            if (x < 2) {
                System.out.println(noSimple);
            } else {
                for (int i = 2; i < x / 2; i++) {
                    if (x % i == 0) {
                        b = false;
                    }
                }

            }

            System.out.println(b == true ? simple : noSimple);
            System.out.println("Еще раз? 1 - да, 0 - нет");
        } while (scanner.nextInt() == 1);
    }

    private static void runFibonacci(){
//        Fn = Fn-1 + Fn-2
// TODO Напишите программу для вывода первых N чисел Фибоначчи.

    }

//    TODO Напишите программу для поиска наименьшего числа в заданном массиве.
//    TODO Напишите программу для перевода введенного числа из десятичной системы счисления в двоичную.
//    TODO Напишите программу для нахождения всех простых чисел в заданном диапазоне
//    TODO Напишите программу для инверсии порядка слов в введенном предложении.



}

