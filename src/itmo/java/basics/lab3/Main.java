package itmo.java.basics.lab3;

public class Main {
    public static void main(String[] args) {
        // 1
        Study study = new Study("Изучение Java - это просто!");

        System.out.println(study.printCourse());

        // 2
        Car car1 = new Car("RED", "LADA", 400.10);
        Car car2 = new Car("RED");
        Car car3 = new Car();

        car1.printCarData();
        car2.printCarData();
        car3.printCarData();

        // 3
        House house1 = new House();
        house1.setHouse("HOUSE1", 10, 1999);
        house1.printHouseData();
        house1.printHouseAge();

        House house2 = new House();
        house2.setHouse("HOUSE2", 20, 1970);
        house2.printHouseData();
        house2.printHouseAge();

        // 4
        new Tree();
        new Tree("APPLE", 10, false);
        new Tree("APPLE", 20);
    }
}
