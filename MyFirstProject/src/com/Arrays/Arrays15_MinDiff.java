package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays15_MinDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 5, 3, 19, 18, 25};
		
		int min = Integer.MAX_VALUE;
		int first = 0;
		int second = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				int diff = Math.abs(arr[i] - arr[j]);
				if(diff < min) {
					min = diff;
					first = arr[i];
					second = arr[j];
				}
			}
		}
		System.out.println(first + " " + second);
	}

}
