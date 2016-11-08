package lambda;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public static int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    // TODO: Use operateBinary method to implement this
    public static int addition(int x, int y) {
        return operateBinary(x, y, (a, b) -> a + b);
    }

    // TODO: Use operateBinary method to implement this
    public static int subtraction(int x, int y) {
        return operateBinary(x, y, (a, b) -> a - b);
    }

    // TODO: Use operateBinary method to implement square sum z = x^2 + y^2
}
