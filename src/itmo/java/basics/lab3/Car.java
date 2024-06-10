package itmo.java.basics.lab3;

import java.util.Objects;

public class Car {
    private String color;
    private String name;
    private double weight;

    Car() {}

    Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    Car(String color) {
        this.color = color;
    }

    Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void printCarData() {
        String color = Objects.isNull(this.color) ? "-" : this.color;
        String name = Objects.isNull(this.name) ? "-" : this.name;

        System.out.printf("color: %s\nname: %s\nweight %.2f\n", color, name, this.weight);
    }
}
