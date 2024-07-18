package itmo.java.basics.lab11;

public class HundredThreads extends Thread {
    private final Counter counter;

    public HundredThreads(Counter counter) {
        this.counter = counter;
    }

    public void startThreads() {
        for (int i = 0; i < 100; i++) {
            new HundredThreads(counter).start();
        }
    }

    @Override
    public void run() {
        synchronized (getCounter()) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }

        System.out.println("Final result: " + getCounter().getCount());
    }

    public Counter getCounter() {
        return counter;
    }
}
