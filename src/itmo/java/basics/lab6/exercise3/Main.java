package itmo.java.basics.lab6.exercise3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100, "LADA", Color.BLACK, 200);
        car.outPut();

        Truck truck = new Truck(200, "KAMAZ", Color.BLACK, 300, 8, 500);
        truck.setAndPrintWheelsAmount(10);
        truck.outPut();
    }
}
