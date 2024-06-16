package itmo.java.basics.lab6.exercise2;

abstract public class Human implements IHuman {
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
}
