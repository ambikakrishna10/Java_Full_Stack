package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Spiral Matrix....

public class Arrays12_SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		int top = 0;
		int bottom = matrix.length-1;
		
		int left = 0;
		int right = matrix[0].length-1;
		
		System.out.print("Spiral Order : ");
		
		while(top <= bottom && left <= right) {
			
			for(int i=left;i<=right;i++) {				
				System.out.print(matrix[top][i] + " ");
			}
			top++;
			
			for(int j=top;j<=bottom;j++) {	
				System.out.print(matrix[j][right] + " ");
			}
			right--;
			
			if(top <= bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}
			
			if(left <= right) {
				for(int j=bottom;j>=top;j--) {
					System.out.print(matrix[j][left] + " ");
				}
				left++;
			}
		}
		System.out.println();
	}
}
