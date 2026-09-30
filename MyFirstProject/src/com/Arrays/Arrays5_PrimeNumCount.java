package com.Arrays;

import java.util.Scanner;

// No of Prime numbers in an array...

public class Arrays5_PrimeNumCount {
	
	static void PrimeCount(int[] arr) {
		
		int primeCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			
			if(num > 1) {
				int count = 0;
				
				for(int j=1;j<=num;j++) {
					if(num % j == 0) {
						count++;
					}
				}
				if(count == 2) {
					primeCount++;
				}
			}
			
		}
		System.out.println("Total no of prime numbers in the array :" + primeCount);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements int the array :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		PrimeCount(arr);
	}

}
