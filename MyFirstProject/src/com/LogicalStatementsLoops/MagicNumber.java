package com.LogicalStatementsLoops;

import java.util.Scanner;

public class MagicNumber {

//1234 = 1+2+3+4 = 10
	//10 = 1+0 = 1 (Magic number)
//123454 = 1+2+3+4+5+4 = 15
	//15 = 1+5 = 6 (Not magic number)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		
		while(n > 9) {
			int sum = 0;
			while(n > 0) {
				int r = n%10;
				n = n/10;
				sum += r;
			}
			n = sum;
		}
		
		if(n == 1) {
			System.out.println("Given number is magic number");
		}else {
			System.out.println("Given number is not magic nmuber !");
		}
	}

}
