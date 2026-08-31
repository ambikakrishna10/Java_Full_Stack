package com.LogicalStatementsLoops;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter starting number : ");
		int m = sc.nextInt();
		
		System.out.print("Enter ending number : ");
		int n = sc.nextInt();
		
		while(m < n) {
			System.out.print(m + " ");
			m++;
		}
	}
}
