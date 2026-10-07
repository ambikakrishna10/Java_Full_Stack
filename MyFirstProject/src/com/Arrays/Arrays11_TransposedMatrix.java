package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Transposed Matrix....

public class Arrays11_TransposedMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr =  {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		// Creating new array...
		int[][] transposed = new int[rows][cols];
		
		
		// For matrix transpose...
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				transposed[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transposed Martix..");
		
		for(int i=0;i<transposed.length;i++) {
			
			for(int j=0;j<transposed[0].length;j++) {
				
				System.out.print(transposed[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
	}

}
