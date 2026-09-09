package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramGroups {

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String word : words) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);

			String Key = new String(ch);

			if (map.containsKey(Key)) {
				map.get(Key).add(word);
			} else {
				ArrayList<String> list = new ArrayList<>();
				list.add(word);
				map.put(Key, list);
			}
		}
		System.out.println(map.values());
	}
}
