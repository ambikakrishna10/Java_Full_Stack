package com.LogicalStatementsLoops;

import java.util.Scanner;

public class PalindromeNumber {
	
// 121 == 121 (Palindrome number)
// 123 != 321 (Not palindrome)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int res = 0;
		
		while(n > 0) {
			r = n % 10;
			n = n / 10;
			res = res * 10 + r;
		}
		if(temp == res) {
			System.out.println("Given number is palindrome..");
		}else {
			System.out.println("Given number is not palindrome !");
		}
	}

}
