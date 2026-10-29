package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		
		l1.add(400);
		l1.add(1, 100);
		l1.add(2, 200);
		
		l1.add(3, 300);
		l1.add(4, 400);
		
		System.out.println(l1);
	}

}
