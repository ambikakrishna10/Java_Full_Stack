package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.next();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + " , ");
		}
	}

}
