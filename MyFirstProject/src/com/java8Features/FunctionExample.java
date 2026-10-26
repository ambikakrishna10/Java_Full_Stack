package com.java8Features;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		
		Function<String, String> f = s -> s.toUpperCase();
		
		String result = f.apply(str);
		System.out.println(result);
	}

}
