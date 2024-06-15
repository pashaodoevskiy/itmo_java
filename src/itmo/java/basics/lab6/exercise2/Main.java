package itmo.java.basics.lab6.exercise2;

public class Main {
    public static void main(String[] args) {
        Human client1 = new Client("Иван", "Иванов", "СберБанк");
        Human client2 = new Client("Петр", "Петрович", "АльфаБанк");

        printHumanFullName(client1);
        printHumanInfo(client1);
        printHumanFullName(client2);
        printHumanInfo(client2);

        Human employee1 = new BankEmployee("Сергей", "Сергеевич", "СберБанк");
        Human employee2 = new BankEmployee("Федор", "Федорович", "АльфаБанк");

        printHumanFullName(employee1);
        printHumanInfo(employee1);
        printHumanFullName(employee2);
        printHumanInfo(employee2);
    }

    public static void printHumanFullName(Human human) {
        if (human instanceof BankEmployee) {
            System.out.println("Работник: " + human.getName());
        } else {
            System.out.println("Клиент: " + human.getFullName());
        }
    }

    public static void printHumanInfo(Human human) {
        System.out.println(human.getFullInfo());
    }
}
