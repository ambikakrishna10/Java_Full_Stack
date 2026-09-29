package com.Arrays;

import java.util.Scanner;

// Min and Max element in an array..

public class Arrays3_MinMaxElement {
	
	static void MinMax(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Minimum number in the array is :" + min);
		System.out.println("Maximum number in the array is :" + max);
		
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
		
		MinMax(arr);
	}
}
