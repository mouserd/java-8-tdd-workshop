package lambda;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public static int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    // Use operateBinary method to implement this
    public static int addition(int x, int y) {
        return operateBinary(x, y, (a, b) -> a + b);
    }

    // Use operateBinary method to implement this
    public static int subtraction(int x, int y) {
        return operateBinary(x, y, (a, b) -> a - b);
    }
}
