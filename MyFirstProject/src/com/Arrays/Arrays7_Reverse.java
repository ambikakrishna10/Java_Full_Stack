package com.Arrays;

import java.util.Scanner;

//Reversing an array..


public class Arrays7_Reverse {
	
	static void Reverse(int[] arr){
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
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
		
		Reverse(arr);
		
	}

}
