package itmo.java.basics.lab6.exercise1;

public class Main {
    public static void main(String[] args) {
        Human client1 = new Client("Иван", "Иванов", "СберБанк");
        Human client2 = new Client("Петр", "Петрович", "АльфаБанк");

        printHumanInfo(client1);
        printHumanInfo(client2);

        Human employee1 = new BankEmployee("Сергей", "Сергеевич", "СберБанк");
        Human employee2 = new BankEmployee("Федор", "Федорович", "АльфаБанк");

        printHumanInfo(employee1);
        printHumanInfo(employee2);
    }

    public static void printHumanInfo(Human human) {
        System.out.println(human.getFullInfo());
    }
}
