package com.multithreading;

class ThreadOne extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

class ThreadTwo extends Thread {

    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();

        t1.join();

        t2.start();
    }
}