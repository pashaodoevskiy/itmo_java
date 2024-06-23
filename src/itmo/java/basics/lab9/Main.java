package itmo.java.basics.lab9;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        // exercise1
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random() * 20));
        }

        System.out.printf("non unique list: %s%n", list);
        System.out.printf("unique list: %s%n", getUniqIntegerList(list));

        // exercise2
        List<Integer> arrayList = addElements(new ArrayList<>(list));
        List<Integer> linkedList = addElements(new LinkedList<>(list));

        long startGetRandomValueFromArrayList = currentTimeMillis();
        getRandomValueFromList(arrayList);
        long endGetRandomValueFromArrayList = currentTimeMillis();

        long durationGetRandomValueFromArrayList = endGetRandomValueFromArrayList - startGetRandomValueFromArrayList;

        long startGetRandomValueFromLinkedList = currentTimeMillis();
        getRandomValueFromList(linkedList);
        long endGetRandomValueFromLinkedList = currentTimeMillis();

        long durationGetRandomValueFromLinkedList = endGetRandomValueFromLinkedList - startGetRandomValueFromLinkedList;

        // использует массив для хранения элементов доступ к элементу выполняется по индексу
        System.out.printf("getRandomValueFromArrayList: %d%n", durationGetRandomValueFromArrayList);
        // LinkedList не использует массив, каждый элемент содержит ссылку на соседний,
        // чтобы найти элелмент необходимо пройти по всему списку
        System.out.printf("getRandomValueFromLinkedList: %d%n", durationGetRandomValueFromLinkedList);

        // exercise3
        Map<User, Integer> playersScore = new HashMap<>();

        for (String name : new String[]{"Иван", "Борис", "Виктор"}) {
            playersScore.put(new User(name), (int)(Math.random() * 100));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String name = scanner.nextLine();

        for (Map.Entry<User, Integer> entry : playersScore.entrySet()) {
            if (Objects.equals(entry.getKey().getName(), name)) {
                System.out.printf("Игрок: %s, очки: %d", name, entry.getValue());
                return;
            }
        }

        System.err.println("Игрок не найден");
    }

    private static HashSet<Integer> getUniqIntegerList(List<Integer> list) {
        return new HashSet<>(list);
    }

    private static List<Integer> addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        return list;
    }

    private static void getRandomValueFromList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            //noinspection ResultOfMethodCallIgnored
            list.get((int)(Math.random() * list.size()));
        }
    }
}
