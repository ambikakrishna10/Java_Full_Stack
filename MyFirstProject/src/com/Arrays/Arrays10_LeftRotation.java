package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Array left rotation by K partitions..

public class Arrays10_LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5};
		System.out.print("Enter no of rotations :");
		int k = sc.nextInt();
		
		for(int i=0;i<k;i++) {
			int start = arr[0];
			
			for(int j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = start;
		}
		System.out.println(Arrays.toString(arr));
	}

}
