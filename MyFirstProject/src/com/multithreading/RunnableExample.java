package com.multithreading;

class NumberTask implements Runnable {

    @Override
    public void run() {

        for (int i = 2; i <= 20; i = i + 2) {
            System.out.print(i);

            if (i < 20) {
                System.out.print(",");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        NumberTask task = new NumberTask();

        Thread t = new Thread(task);

        t.start();
    }
}