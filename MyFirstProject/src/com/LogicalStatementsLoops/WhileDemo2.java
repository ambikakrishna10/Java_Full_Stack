package com.LogicalStatementsLoops;

import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n = 0;
		int count = 0;
		while(n <= 5) {
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
			if(num%2==0) {
				count++;
				n++;
				if(count == 5) {
					System.out.println("Five even numbers entered.");
					break;
				}
			}
		}
	}
}
