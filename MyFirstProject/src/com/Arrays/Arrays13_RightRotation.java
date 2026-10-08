package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Array right rotation by K partitions..

public class Arrays13_RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5};
		
		System.out.print("Enter no of rotations :");
		int k = sc.nextInt();
		
		for(int i=0;i<k;i++) {
			int last = arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.print("After Rotation :");
		System.out.println(Arrays.toString(arr));
	}

}
