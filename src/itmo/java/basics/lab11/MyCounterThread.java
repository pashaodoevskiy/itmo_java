package itmo.java.basics.lab11;

public class MyCounterThread extends Thread {
    private final Counter counter;

    public MyCounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
}
