package itmo.java.basics.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator.main(args);

        User defaultUser = new User();

        User customUser = new User("Name", "Surname", "tmp@email.com", 20);
        customUser.setName("NewName");
        customUser.setSurname("NewSurname");

        System.out.println(defaultUser);
        System.out.println(customUser);
    }
}
