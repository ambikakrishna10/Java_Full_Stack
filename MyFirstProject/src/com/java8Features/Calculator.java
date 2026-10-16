package com.java8Features;

@FunctionalInterface
interface result {
	int add(int a, int b);
}

public class Calculator {

	public static void main(String[] args) {
		
		result rs = (a, b) -> (a + b);
		
		int sum = rs.add(10, 20);
		
		System.out.println("Sum :" + sum);
	}

}
