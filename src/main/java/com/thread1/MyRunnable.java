package com.thread1;
public class MyRunnable implements Runnable {
    MyRunnable() {}
    public void run() {
        System.out.println("Hello from a thread: " + this.toString());
    }
}
