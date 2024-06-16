package itmo.java.basics.lab6.exercise5;

import java.util.Scanner;

public class Parent {
    private String age;
    protected final Scanner scanner = new Scanner(System.in);

    public void print() {
        System.out.print("Ведите возраст: ");
        this.age = scanner.next();

        System.out.println(this.age);
    }
}
