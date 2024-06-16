package itmo.java.basics.lab6.exercise5;

public class Child extends Parent {
    private String name;

    @Override
    public void print() {
        System.out.print("Ведите имя: ");
        this.name = scanner.next();

        System.out.println(this.name);
    }
}
