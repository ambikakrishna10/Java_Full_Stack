package com.multithreading;

class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SleepExample {
    public static void main(String[] args) {

        NumberThread t = new NumberThread();

        t.start();
    }
}