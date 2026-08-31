package com.LogicalStatementsLoops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int r = 0, sum = 0;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum*10+r;
		}
		System.out.println("Reverse number is :" + sum);
	}

}
