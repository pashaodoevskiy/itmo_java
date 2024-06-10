package itmo.java.basics.lab3;

import java.time.Year;

public class House {
    private String name;
    private int floors;
    private int year;

    public String getName() {
        return name;
    }

    public void setHouse(String name, int floors, int year) {
        this.name = name;
        this.floors = floors;
        this.year = year;
    }

    public void printHouseData() {
        System.out.printf("name: %s, floors: %d, year: %d\n", name, floors, year);
    }

    public void printHouseAge() {
        System.out.printf("%s age: %d\n", this.name, this.getHouseAge());
    }

    public int getHouseAge() {
        int currentYear = Year.now().getValue();

        return currentYear - this.year;
    }
}
