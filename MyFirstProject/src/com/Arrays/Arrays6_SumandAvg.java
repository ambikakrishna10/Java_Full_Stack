package com.Arrays;

import java.util.Scanner;

// Sum and avg of elements in an array...

public class Arrays6_SumandAvg {
	
	static void SumAndAvg(int[] arr) {
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println("Sum of the elements in the array " + sum);
		System.out.println("Avg of the elements in the array " + avg);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements in the array :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		SumAndAvg(arr);
	}

}
