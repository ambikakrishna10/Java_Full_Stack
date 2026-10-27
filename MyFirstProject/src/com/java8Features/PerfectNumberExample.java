package com.java8Features;

@FunctionalInterface
interface PerfectNumber {
	boolean check(int n);
}

public class PerfectNumberExample {

	public static void main(String[] args) {

		PerfectNumber p = (n) -> {
			int sum = 0;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}
			}
			return sum == n;
		};
		System.out.println(p.check(7));
	}

}
