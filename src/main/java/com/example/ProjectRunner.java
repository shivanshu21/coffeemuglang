package com.example;

import com.thread1.MultiThreaded;

public class ProjectRunner {
    public static void main(String args[]) {
        Greeting.sayHi();
        try {
            MultiThreaded.Entrypoint();
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
