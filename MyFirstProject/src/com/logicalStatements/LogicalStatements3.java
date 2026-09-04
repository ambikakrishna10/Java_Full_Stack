package com.logicalStatements;

import java.util.Scanner;

public class LogicalStatements3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the type of the seat you want to book : ");
		char c = sc.next().toUpperCase().charAt(0);
		
		switch(c) {
		case 'G' -> System.out.println("General ticket Price is 150/-");
		case 'P' -> System.out.println("Premium ticket price is 250/-");
		case 'V' -> System.out.println("VIP ticket price is 400/-");
		default -> System.out.println("Invalid seat selection !");
		}
	}

}
