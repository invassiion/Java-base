package Lesson24;

import collection.animal.Dog;

public class TypeConversion {
private static void  runStringToByte() {
    System.out.println();
    System.out.println("runStringToByte");

    String str1 = "111";
    Byte b1 = Byte.valueOf(str1);
    System.out.println(b1);

    byte b2 = Byte.parseByte(str1);
    System.out.println(b2);

}

private static void runStringToInt() {
    System.out.println();
    System.out.println("runStringToInt");

    String str = "1234";
    Integer i1 = Integer.valueOf(str);
    int i2 = Integer.parseInt(str);


    System.out.println(i1);
    System.out.println(i2);
}

private static void runStringToDouble() {
    System.out.println();
    System.out.println("runStringToDouble");


    Double d1 = Double.valueOf("1.213");
    double d2 = Double.parseDouble("12.135");
    System.out.println(d1);
    System.out.println(d2);

}


private static void runStringToBoolean() {
    System.out.println();
    System.out.println("runStringToBoolean");

    Boolean b1 = Boolean.valueOf("true");
    Boolean b2 = Boolean.valueOf("false");
    Boolean b3 = Boolean.valueOf("yea");
    Boolean b4 = Boolean.valueOf("1");
    Boolean b5 = Boolean.valueOf("true");
    Boolean b6 = Boolean.valueOf("TRue");

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);

}


    public static void run() {
        runStringToByte();
        runStringToInt();
        runStringToDouble();
        runStringToBoolean();
    }
}
