package itmo.java.basics.lab9;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        // exercise1
        List<Integer> list = addElements(new ArrayList<>(), 50);

        System.out.printf("non unique list: %s%n", list);
        System.out.printf("unique list: %s%n", getUniqIntegerList(list));

        // exercise2
        List<Integer> arrayList = addElements(new ArrayList<>(), 1000000);
        List<Integer> linkedList = addElements(new LinkedList<>(), 1000000);

        // использует массив для хранения элементов доступ к элементу выполняется по индексу
        printExecutionDuration(arrayList, 100000, "Время выполнения выборки для arrayList: ");
        // LinkedList не использует массив, каждый элемент содержит ссылку на соседний,
        // чтобы найти элелмент необходимо пройти по всему списку
        printExecutionDuration(linkedList, 100000, "Время выполнения выборки для linkedList: ");

        // exercise3
        Map<User, Integer> playersScore = addPlayersAndRandomScore(Arrays.asList("Иван", "Борис", "Виктор"));
        printPlayerScoreByName(playersScore);
    }

    private static <T> Set<T> getUniqIntegerList(List<T> list) {
        return new HashSet<>(list);
    }

    private static List<Integer> addElements(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * size));
        }

        return list;
    }

    private static <T> void printExecutionDuration(List<T> list, int numberOfIteration, String text) {
        long startGetRandomValueFromArrayList = currentTimeMillis();

        for (int i = 0; i < numberOfIteration; i++) {
            //noinspection ResultOfMethodCallIgnored
            list.get((int)(Math.random() * list.size()));
        }

        long endGetRandomValueFromArrayList = currentTimeMillis();

        long durationGetRandomValueFromArrayList = endGetRandomValueFromArrayList - startGetRandomValueFromArrayList;

        System.out.println(text + durationGetRandomValueFromArrayList);
    }

    private static Map<User, Integer> addPlayersAndRandomScore(List<String> names) {
        Map<User, Integer> playersScore = new HashMap<>();

        for (String name : names) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            playersScore.put(new User(name), (int)(Math.random() * 100));
        }

        return playersScore;
    }

    private static void printPlayerScoreByName(Map<User, Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String name = scanner.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        User user = new User(name);

        if (list.containsKey(user)) {
            System.out.printf("Игрок: %s, очки: %d", name, list.get(user));
        } else {
            System.err.println("Игрок не найден");
        }
    }
}
