package com.java8Features;

@FunctionalInterface
interface Message {
    void display();
}

public class Example1 {
    public static void main(String[] args) {

        Message msg = () -> System.out.println("Hello Java");

        msg.display();
    }
}