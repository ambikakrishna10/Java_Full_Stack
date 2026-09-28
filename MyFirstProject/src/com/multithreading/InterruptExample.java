package com.multithreading;

class MyThread2 extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Thread is sleeping...");

            Thread.sleep(5000);

            System.out.println("Thread completed its sleep");

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException {

        MyThread2 t = new MyThread2();

        t.start();

        Thread.sleep(2000);

        t.interrupt();
    }
}