package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(50);
		
		l1.add(0,1);
		l1.add(2,30);

		l1.add(null);
		l1.add(null);
		
		System.out.println(l1);
	}

}
