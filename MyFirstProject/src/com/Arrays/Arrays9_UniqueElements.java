package com.Arrays;

import java.util.Arrays;

public class Arrays9_UniqueElements {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,1,4,5};
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			boolean unique = false;

			for(int j=0;j<i;j++) {
				
				if(arr[i] == arr[j]) {
					unique = true;
					break;
				}
			}
			if(!unique) {
				arr[count] = arr[i];
				count++;
			}
		}
		int[] result = Arrays.copyOf(arr,count);
		System.out.println(Arrays.toString(result));
		
	}

}
