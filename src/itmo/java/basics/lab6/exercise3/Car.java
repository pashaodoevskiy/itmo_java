package itmo.java.basics.lab6.exercise3;

public class Car {
    public int weight;
    public String model;
    public Color color;
    public float speed;

    public Car () {}

    public Car (int w, String m, Color c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color.getDescription() + " и её скорость - " + speed);
    }
}
