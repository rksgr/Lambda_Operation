@FunctionalInterface
interface MathFunctions{
    int calculate(int a, int b);
    static void printMathOperationResult(int a,int b,String function, MathFunctions mfo){
        System.out.println("Result of math operation "+ function+ " is: " +
                ""+ mfo.calculate(a,b));
    }
}

public class MathOperationApp {

    public static void main(String[] args) {
        /*
        Use case 1.1: Lambda expression to perform math operation
         */

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

        /*
        Use case 1.2: Basic arithmetic operations using lambda function
         */
        // Pass lambda expression as function parameter to print result using static function
        MathFunctions.printMathOperationResult(4,8,"Addition",add);
        MathFunctions.printMathOperationResult(16,8,"Subtraction",subtract);
        MathFunctions.printMathOperationResult(16,8,"Division",divide);
    }
}
