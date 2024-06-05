package itmo.java.basics.lab_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise_1();
        System.out.println();
        exercise_2();
        System.out.println();
        exercise_3();
        System.out.println();
        exercise_4();
        System.out.println();
        exercise_5();
        System.out.println();
        exercise_6();

    }

    public static void exercise_1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    public static void exercise_2() {
        double a = (46 + 10) * ((double) 10 / 3);
        int b = 29 * 4 * -15;

        System.out.println(a);
        System.out.println(b);
    }

    public static void exercise_3() {
        int number = 10500;
        int result = number / 10 / 10;

        System.out.println(result);
    }

    public static void exercise_4() {
        double x = 3.6;
        double y = 4.1;
        double z = 5.9;

        double result = x * y * z;
        System.out.println(result);
    }

    public static void exercise_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();

        System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
    }

    public static void exercise_6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("b = ");
        int b = scanner.nextInt();

        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
