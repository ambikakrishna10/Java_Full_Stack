package com.Arrays;

public class Arrays1_DemoProgram {

	public static void main(String[] args) {
		
		int arr[];
		
		arr = new int[5];
		
		arr[0] = 20;
		arr[1] = 21;
		arr[2] = 22;
		arr[3] = 21;
		arr[4] = 20;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
