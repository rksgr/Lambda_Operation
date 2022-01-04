@FunctionalInterface
interface MathFunctions{
    int calculate(int a, int b);
}

public class MathOperationApp {

    public static void main(String[] args) {

        // This expression implements MathFunctions.
        MathFunctions add = (int a,int b) ->a+b;
        MathFunctions subtract = (int a, int b) -> a-b;
        MathFunctions divide = (int a,int b) -> {
            if (b==0){return 0;}
            return a/b;
        };

        // add, subtract and divide two numbers using lambda expression
        System.out.println("Addition result: "+ add.calculate(1,2));
        System.out.println("Subtraction result: "+ subtract.calculate(4,5));
        System.out.println("Division result: "+ divide.calculate(9,3));
    }
}
