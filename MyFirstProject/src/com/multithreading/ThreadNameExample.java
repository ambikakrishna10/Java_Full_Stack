package com.multithreading;

class MyThread1 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread Name: " + getName());

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);

            if (i < 5) {
                System.out.print(",");
            }
        }
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {

        MyThread1 t = new MyThread1();

        t.setName("StudentThread");

        t.start();
    }
}