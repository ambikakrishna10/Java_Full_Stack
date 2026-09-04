package com.logicalStatements;

import java.util.Scanner;

public class LogicalStatements4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select what type of animal you want.");
		System.out.println("1.Domestic animals");
		System.out.println("2.Wild animals");
		int val = sc.nextInt();
		switch(val) {
		case 1:
			System.out.print("Select any 1 from 2 animals: ");
			int dom1 = sc.nextInt();
			switch(dom1) {
			case 1:
				System.out.println("Cow");
				break;
			case 2:
				System.out.println("Dog");
				break;
			}
			break;
		case 2:
			System.out.print("Select any 1 from 2 animals: ");
			int wild1 = sc.nextInt();
			switch(wild1) {
			case 1:
				System.out.println("Lion");
				break;
			case 2:
				System.out.println("Tiger");
				break;
			}
			break;
		}
		
	}

}
