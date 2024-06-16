package itmo.java.basics.lab6.exercise3;

public class Truck extends Car {
    private int wheelsAmount;
    private int maxWeight;

    public Truck(int w, String m, Color c, float s, int wheelsAmount, int maxWeight) {
        super(w, m, c, s);
        this.wheelsAmount = wheelsAmount;
        this.maxWeight = maxWeight;
    }

    public void setAndPrintWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;

        System.out.println(this.wheelsAmount);
    }
}
