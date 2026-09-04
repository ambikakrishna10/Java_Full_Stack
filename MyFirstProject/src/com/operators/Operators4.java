package com.operators;

import java.util.Scanner;

public class Operators4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		String result = (a%3 == 0 || a%7 == 0)?"true":"false";
		System.out.println(result);
	}

}
