package com.thread1;
public class MultiThreaded {
    public MultiThreaded() {}
    public static void Entrypoint() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            (new Thread(new MyRunnable())).start();
            System.out.println("Done with " + String.valueOf(i));
        }
    }
}