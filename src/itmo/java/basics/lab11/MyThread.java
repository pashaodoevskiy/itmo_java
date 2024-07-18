package itmo.java.basics.lab11;

public class MyThread extends Thread {

    private final String name;
    private final Object lock;

    public MyThread(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                System.out.println(name);

                lock.notify();

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
