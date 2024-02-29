package lesson16;

import java.util.Random;

public class SwitchExample {
    public static void run() {
        Random random = new Random();
        int example = random.nextInt(5);


//        if (example == 0) {
//            System.out.println("This is zero");
//        } else if (example == 1) {
//            System.out.println("This is one");
//        } else if (example == 2) {
//            System.out.println("This is two");
//        } else if (example == 3) {
//            System.out.println("This is free");
//        } else if (example == 4) {
//            System.out.println("This is four");
//        } else if (example == 5) {
//            System.out.println("This is five");
//        }

        switch (example) {
            case 0:
                System.out.println("This is zero");
                break;
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is two");
                break;
            case 3:
                System.out.println("This is free");
                break;
            case 4:
                System.out.println("This is four");
                break;
            default:
                System.out.println("Other digit");
                break;
        }
    }
}
