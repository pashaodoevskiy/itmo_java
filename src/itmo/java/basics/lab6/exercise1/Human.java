package itmo.java.basics.lab6.exercise1;

abstract public class Human {
    private final String name;
    private final String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String getFullInfo();
}
