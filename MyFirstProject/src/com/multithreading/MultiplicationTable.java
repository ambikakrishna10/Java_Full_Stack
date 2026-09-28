package com.multithreading;

import java.util.Scanner;

class TableThread extends Thread {

    int num;

    TableThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        TableThread t = new TableThread(num);

        t.start();
    }
}