package itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printOddNumbers();
        printNumbersDivisibleByTreeAndFive();
        System.out.println("Результат: " + isSumOfTwoNumbersEqualThird());
        System.out.println("Результат: " + isThirdNumberLargest());
        System.out.println("Результат: " + isNumberThreeInStartOrEndOfArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Результат: " + isNumberThreeInStartOrEndOfArray(new int[]{1}));
        System.out.println("Результат: " + isNumberThreeInStartOrEndOfArray(new int[]{3, 2, 3, 4, 5}));
        System.out.println("Результат: " + isArrayContainsNumberOneOrThree(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Результат: " + isArrayContainsNumberOneOrThree(new int[]{0, 2, 0, 4, 5}));
        isArraySortAsc(new int[]{1, 2, 3, 4, 5});
        isArraySortAsc(new int[]{6, 2, 3, 4, 5});
        fillArray();
        swapFirstAndLastElement(new int[]{6, 2, 3, 4, 5});
        findFirstUniqueNumber(new int[]{1, 2, 3, 6, 7, 1});
    }

    private static void printOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void printNumbersDivisibleByTreeAndFive() {
        int divisibleByTreeIndex = 0;
        int divisibleByFiveIndex = 0;
        int divisibleByTreeAndFiveIndex = 0;

        int[] divisibleByTree = new int[100 / 3];
        int[] divisibleByFive = new int[100 / 5];
        int[] divisibleByTreeAndFive = new int[100 / (3 * 5)];

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                divisibleByTree[divisibleByTreeIndex++] = i;
            }

            if (i % 5 == 0) {
                divisibleByFive[divisibleByFiveIndex++] = i;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                divisibleByTreeAndFive[divisibleByTreeAndFiveIndex++] = i;
            }
        }

        System.out.println("Делится на 3: " + Arrays.toString(divisibleByTree));
        System.out.println("Делится на 5: " + Arrays.toString(divisibleByFive));
        System.out.println("Делится на 3 и на 5: " + Arrays.toString(divisibleByTreeAndFive));
    }

    private static boolean isSumOfTwoNumbersEqualThird() {

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return (x + y) == z;
    }

    private static boolean isThirdNumberLargest() {
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int z = scanner.nextInt();

        return y > x && z > y;
    }

    private static boolean isNumberThreeInStartOrEndOfArray(int[] array) {
        return array.length >= 2 && (array[0] == 3 || array[array.length - 1] == 3);
    }

    private static boolean isArrayContainsNumberOneOrThree(int[] array) {
        for(int item: array) {
            if (item == 1 || item == 3) {
                return true;
            }
        }

        return false;
    }

    private static void isArraySortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i - 1] >= array[i]) {
                System.out.println("Please, try again");
                return;
            }
        }

        System.out.println("OK");
    }

    private static void fillArray() {
        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(array));
    }

    private static void swapFirstAndLastElement(int[] array1) {
        int[] array2 = array1.clone();
        array2[0] = array1[array1.length - 1];
        array2[array1.length - 1] = array1[0];

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    private static void findFirstUniqueNumber(int[] array) {
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
