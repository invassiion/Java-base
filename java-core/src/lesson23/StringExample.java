package lesson23;

import java.util.stream.Stream;

public class StringExample {
    private static String str() {
        return "Добро пожаловать";
    }

    private static void runContentEquals() {
        System.out.println("runContentEquals");
        String str1 = str();
        String str2 = "Java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str3: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);
    }

    private static void runEqualsIgnoreCase() {
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");
        String str1 = str();
        String str2 = str1;
        String str3 = "java";
        String str4 = "ДОбРО ПожАЛОВать";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));

    }

    public static void runCompareTo() {
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я вызываю класс!";

        System.out.println("  " + str1.compareTo(str2));
        System.out.println("  " + str2.compareTo(str3));
        System.out.println("  " + str3.compareTo(str1));
    }

    private static void runCompareToIgnoreCase() {
        System.out.println("");
        System.out.println("runCompareToIgnoreCase");

        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю метод!";
        String str3 = "Я вызываю класс!";

        System.out.println("  " + str1.compareTo(str2));
        System.out.println("  " + str2.compareTo(str3));
        System.out.println("  " + str3.compareTo(str1));
    }

    private static void runToLowerCase() {
        System.out.println();
        System.out.println("runToLowerCase");

        String str = "Я вызываю метод!";
        System.out.println(str);
        System.out.println(str.toLowerCase());
    }

    private static void runToUpperCase() {
        System.out.println();
        System.out.println("runToLowerCase");

        String str = "Я вызываю метод!";
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }

    private static void runConcat() {
        System.out.println();
        System.out.println("runConcat");
        String s = "Я вызываю метод!";
        s = s.concat(" И я вызываю класс!");
        System.out.println(s);
        s = s + "И еще один символ";
        System.out.println(s);
    }

    private static void runMatches() {
        System.out.println();
        System.out.println("runMatches");

        String s = str();

        System.out.println(s.matches("(.*)пож(.*)"));
        System.out.println(s.matches("пож"));
        System.out.println(s.matches("пож(.*)"));
    }

    private static void runRegionMatches() {
        System.out.println();
        System.out.println("runRegionMatches");

        String s1 = str(),
                s2 = "Добро пожаловать",
                s3 = "пожаловать",
                s4 = "ДОБРО ПОЖАЛОВАТЬ";

        System.out.println(s1.regionMatches(0, s2,0,10));
        System.out.println(s1.regionMatches(6, s3,0,8));
        System.out.println(s1.regionMatches(true,2,s4,2,8));
    }

    public static void runContains() {
        System.out.println();
        System.out.println("runContains");

        String s = "twinkle twinkle twinkle little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("l1ittle"));
    }

    private static void runStartWith() {
        System.out.println();
        System.out.println("runStartWith");
        String s1 = str(),
                s2 = "Доб",
                s3 = "пож",
                s4 = "До";
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    private static void runEndWith() {
        System.out.println();
        System.out.println("runEndWith");
        String s1 = str(),
                s2 = "пожаловать",
                s3 = "Доб",
                s4 = "ать";
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));
    }

    private static void runLines() {
        System.out.println();
        System.out.println("runLines");

        String s = "line 1 \n"+
                "line 2 \n"+
                "line 3 \n"+
                "line 4 \n"+
                "line 5 \n";
        System.out.println(s);

        Stream<String> lines = s.lines();
        lines.forEach(System.out::println);
        System.out.println(lines);
    }

    private static void runToCharArray() {
        System.out.println();
        System.out.println("runToCharArray");

        String s = str();
        System.out.println(s.toCharArray());

    }

    private static void runFormat() {
        System.out.println();
        System.out.println("runFormat");

        float floatVar = 1.2234234234f;
        int intVat = 12;
        String  strVar = "String";

        String fs;

        fs = String.format(
                "Значение float = %.1f, Значение int = %d, Значение = %s ",
                floatVar,
                intVat,
                strVar
        );
        System.out.println(fs);
    }

    private static  void runValueOf() {
        System.out.println();
        System.out.println("runValueOf");


        double d = 123231.2;
        boolean b = true;
        long l = 1232453345l;
        char[] chars = {'d', 's'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));

    }

    private static void runRepeat() {
        System.out.println();
        System.out.println("runRepeat");

        String s = "string ";
        String repeat = s.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf() {
        System.out.println();
        System.out.println("runIndexOf");

        String s1 =str();
        String s2 = "Доб",s3 ="ать";

        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s3));
    }
    private static void runLastIndexOf() {
        System.out.println();
        System.out.println("runLastIndexOf");

        String s1 =str();
        String s2 = "о",s3 ="ать";

        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.lastIndexOf(s3));
    }

    private static void runSubstring() {
        System.out.println();
        System.out.println("runSubstring");

        String str = str();
        System.out.println(str.substring(0, 10));
    }

    private static void runSubSequence() {
        System.out.println();
        System.out.println("runSubSequence");

        String str = str();
        System.out.println(str.subSequence(0, 10));
    }

    private static void runSplit(){
        System.out.println();
        System.out.println("runSplit");

        String str = str();
        String[] strings = str.split("п");
        for (String s: strings) {
            System.out.println(s);
        }
    }

    private static void runJoin() {
        System.out.println();
        System.out.println("runJoin");

        String join = String.join(", ", "1", "2","3","4","5");
        System.out.println(join);
    }

    private static void runTrim() {
        System.out.println();
        System.out.println("runTrim");

        String s = "s      String    ";
        System.out.println(s);
        System.out.println(s.trim());
    }

    private static void runReplace(){
        System.out.println();
        System.out.println("runReplace");

        String str = str();

        System.out.println(str);
        System.out.println(str.replace("о", "хахаха"));
        System.out.println(str.replaceFirst("о","123"));
        System.out.println(str.replaceAll("123213","12323"));
    }
    public static void run() {
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runRegionMatches();
        runContains();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubstring();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }
}
