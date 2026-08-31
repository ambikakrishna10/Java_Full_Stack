package com.LogicalStatementsLoops;

import java.util.Scanner;

public class PerfectNumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		
		int number = 1;
		
		while(number <= n) {
			if(number > 1) {
				int sum = 0;
				int i = 1;
				
				while(i<=number/2) {
					if(number%i==0) {
						sum = sum + i;
					}
					i++;
				}
				if(sum == number) {
					System.out.println(number);
				}
			}
			number++;
		}
	}

}
