package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Merge two arrays into single array.. After merging sort them..

public class Arrays14_MergingArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };

		int[] merged = new int[arr1.length + arr2.length];

		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			merged[index] = arr1[i];
			index++;
		}

		for (int i = 0; i < arr2.length; i++) {
			merged[index] = arr2[i];
			index++;
		}

		for (int i = 0; i < merged.length - 1; i++) {
			for (int j = i; j < merged.length; j++) {
				if (merged[i] > merged[j]) {
					int temp = merged[i];
					merged[i] = merged[j];
					merged[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(merged));
	}

}
