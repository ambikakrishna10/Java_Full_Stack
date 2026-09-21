package com.Arrays;

import java.util.Scanner;

// Even and Odd numbers count in an array...

public class Arrays2_EvenOddCount {
	
	static void EvenOdd(int[] arr){
		
		int EvenCount = 0, OddCount = 0;

		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
		}
		
		System.out.println("Number of even numbers : " + EvenCount);
		System.out.println("Number of odd numbers : " + OddCount);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements in the array :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		EvenOdd(arr);
	}
}
