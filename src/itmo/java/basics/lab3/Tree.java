package itmo.java.basics.lab3;

public class Tree {
    private String name;
    private int age;
    private boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
