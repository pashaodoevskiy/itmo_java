package itmo.java.basics.lab11;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        createCounterThreads(10);
        printThreadStates();
        createIncrementThreads(100);
        printThreadNames();
    }

    public static void createCounterThreads(int count) {
        ExecutorService executor = Executors.newFixedThreadPool(count);

        for (int i = 0; i < count; i++) {
            executor.execute(() -> {
                int j = 0;
                while (j <= 100) {
                    System.out.println(java.lang.Thread.currentThread().getName() + ": j = " + j);
                    j++;
                }
            });
        }

        executor.shutdown();
    }

    public static void printThreadStates() {
        java.lang.Thread thread = new java.lang.Thread(() -> {
            try {
                java.lang.Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Текущее состояние потока: " + thread.getState());
        thread.start();
        System.out.println("Текущее состояние потока: " + thread.getState());

        try {
            java.lang.Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Текущее состояние потока: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Текущее состояние потока: " + thread.getState());
    }

    public static void createIncrementThreads(int count) {
        Counter counter = new Counter();

        for (int i = 0; i <= count; i++) {
            java.lang.Thread myCallable = new MyCounterThread(counter);
            myCallable.start();
        }

        System.out.println("Счетчик: " + counter.getCount());
    }

    public static void printThreadNames() {
        Object lock = new Object();

        MyThread thread1 = new MyThread("Поток 1", lock);
        MyThread thread2 = new MyThread("Поток 2", lock);

        thread1.start();
        thread2.start();
    }
}
