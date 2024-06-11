package itmo.java.basics.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();
        exercise2();
        System.out.println("Результат: " + exercise3());
        System.out.println("Результат: " + exercise4());
        System.out.println("Результат: " + exercise5(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Результат: " + exercise5(new int[]{1}));
        System.out.println("Результат: " + exercise5(new int[]{3, 2, 3, 4, 5}));
        System.out.println("Результат: " + exercise6(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Результат: " + exercise6(new int[]{0, 2, 0, 4, 5}));
        exercise21(new int[]{1, 2, 3, 4, 5});
        exercise21(new int[]{6, 2, 3, 4, 5});
        exercise22();
        exercise23(new int[]{6, 2, 3, 4, 5});
        exercise24(new int[]{1, 2, 3, 6, 7, 1});
    }

    private static void exercise1() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void exercise2() {
        ArrayList<Integer> divisibleByThree = new ArrayList<>();
        ArrayList<Integer> divisibleByFive = new ArrayList<>();
        ArrayList<Integer> divisibleByThreeAndFive = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                divisibleByThree.add(i);
            }

            if (i % 5 == 0) {
                divisibleByFive.add(i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                divisibleByThreeAndFive.add(i);
            }
        }

        System.out.printf("Делится на 3: %s\n", arrayListToString(divisibleByThree));
        System.out.printf("Делится на 5: %s\n", arrayListToString(divisibleByFive));
        System.out.printf("Делится на 3 и на 5: %s\n", arrayListToString(divisibleByThreeAndFive));
    }

    private static String arrayListToString(ArrayList<Integer> list) {
        return list.stream().map(String::valueOf).collect(Collectors.joining(","));
    }

    private static boolean exercise3() {

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return (x + y) == z;
    }

    private static boolean exercise4() {
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return y > x && z > y;
    }

    private static boolean exercise5(int[] array) {
        return array.length >= 2 && (array[0] == 3 || array[array.length - 1] == 3);
    }

    private static boolean exercise6(int[] array) {
        for(int item: array) {
            if (item == 1 || item == 3) {
                return true;
            }
        }

        return false;
    }

    private static void exercise21(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i - 1] >= array[i]) {
                System.out.println("Please, try again");
                return;
            }
        }

        System.out.println("OK");
    }

    private static void exercise22() {
        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(array));
    }

    private static void exercise23(int[] array1) {
        int[] array2 = array1.clone();
        array2[0] = array1[array1.length - 1];
        array2[array1.length - 1] = array1[0];

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    private static void exercise24(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    System.out.println("Firs unique number: " + array[i]);
                    return;
                }
            }
        }

        System.out.println("No unique numbers found");
    }
}
