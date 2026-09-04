package com.operators;

import java.util.Scanner;

public class Operators5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float a = sc.nextFloat();
		System.out.print("Enter b number: ");
		float b = sc.nextFloat();
		
		System.out.println(a>b && b<a);
		System.out.println(a>b || b<a);
		System.out.println(!(b<a));
	}

}
