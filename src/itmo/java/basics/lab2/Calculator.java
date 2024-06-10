package itmo.java.basics.lab2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("SUM");
        System.out.println(sum(10.51, 10.3));
        System.out.println(sum(9999999999L, 9999999999L));
        System.out.println(sum(11, 2));

        System.out.println("DIVISION");
        System.out.println(division(-10.3, 2));
        System.out.println(division(10000000L, 0));
        System.out.println(division(10, 3));

        System.out.println("MULTIPLICATION");
        System.out.println(multiplication(999999999, 999999999.2));
        System.out.println(multiplication(10000000000L, 10000000000L));
        System.out.println(multiplication(999999999, 999999999));

        System.out.println("SUBTRACTION");
        System.out.println(subtraction(999999999, 999999999.2));
        System.out.println(subtraction(10000000000L, 10000000001L));
        System.out.println(subtraction(999999999, 999999919));
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double division(double a, double b) {
        return divisionByZeroCheck(a / b);

    }

    public static double division(long a, long b) {
        return divisionByZeroCheck((double) a / b);

    }

    public static double division(int a, int b) {
        return divisionByZeroCheck((double) a / b);
    }

    private static double divisionByZeroCheck(double value) {
        if (value == Double.POSITIVE_INFINITY || value == Double.NEGATIVE_INFINITY) {
            System.out.println("Division by zero not possible");

            return 0;
        }

        return value;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static long multiplication(long a, long b) {
        return a * b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static long subtraction(long a, long b) {
        return a - b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
}
