package com.operators;

import java.util.Scanner;

public class Operators2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the recatangle: ");
		float length = sc.nextInt();
		System.out.print("Enter the breadth of the rectangle: ");
		float breadth = sc.nextInt();
		
		float area = length * breadth;
		float perimeter = 2 * (length + breadth);
		
		System.out.println("Area of the rectangle is: " + area);
		System.out.println("Perimeter of the rectangle: " + perimeter);
		
		
	}

}