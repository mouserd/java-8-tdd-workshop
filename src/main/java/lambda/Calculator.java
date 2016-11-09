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
        throw new UnsupportedOperationException("To be implemented");
    }

    // TODO: Use operateBinary method to implement this
    public static int subtraction(int x, int y) {
        throw new UnsupportedOperationException("To be implemented");
    }

    // TODO: Use operateBinary method to implement square sum z = x^2 + y^2
}
