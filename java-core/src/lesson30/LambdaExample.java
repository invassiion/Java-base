package lesson30;

public class LambdaExample  {
    public static void run() {
//        LambdaOperator lambdaOperator = ((x, y) -> x + y);
        LambdaOperator lambdaOperator = ( (x,y) -> {
            System.out.println(x);
            System.out.println(y);
            return x+y;
        });
        System.out.println(lambdaOperator.anyNameOfMethod(10, 10));
    }


}
