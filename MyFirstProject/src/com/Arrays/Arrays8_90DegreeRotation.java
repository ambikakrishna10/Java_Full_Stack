package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// 90 degrees Matrix rotation...

public class Arrays8_90DegreeRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		int n = matrix.length;
		
		// Array Transpose...
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// Reverse each row...
		for(int i=0;i<n;i++) {
			
			int left = 0, right = n-1;
			
			while(left < right) {
				
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
		// Printing each row..
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
