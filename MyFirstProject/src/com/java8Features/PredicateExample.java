package com.java8Features;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(23);
		numbers.add(35);
		numbers.add(40);
		numbers.add(47);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(81);
		numbers.add(95);

		Predicate<Integer> p = n -> n % 2 == 0;

		for (Integer n : numbers) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
	}

}
