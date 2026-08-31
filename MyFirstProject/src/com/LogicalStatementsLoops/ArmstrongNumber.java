package com.LogicalStatementsLoops;

import java.util.Scanner;

public class ArmstrongNumber {

// 153 = 1^3 + 5^3 + 3^3 = 153 
// 370 = 3^3 + 7^3 + 0^3 = 370
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int temp = n;
				
		while(n > 0) {
			r = n % 10;
			sum += r*r*r;
			n = n / 10;
		}
		
		if(sum == temp) {
			System.out.println("Given number is Amstrong..");
		}else {
			System.out.println("Given number is not Amstrong !");
		}
	}

}
