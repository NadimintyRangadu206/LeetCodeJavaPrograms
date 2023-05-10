package com.leetcode.java.programs.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {

		int length = s.length();

		List<String> list = new ArrayList<>();

	int no = length / 2;

		for (int i = 0; i < length; i = i + no) {

			list.add(s.substring(i, i + no));
		}
		System.out.println(list);

		List<Integer> list1 = new ArrayList<>();

		for (String s1 : list) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				for (int j = i + 1; j < s1.length(); j++) {

					if (s1.charAt(i) != s.charAt(j)) {
						count++;
					}
				}
			}

			list1.add(count);

		}

		System.out.println(list1);
		int max = Collections.max(list1);

		return max;
	}

	public static void main(String[] args) {

		LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

		String s = "abcabcbb";

		System.out.println(lswrc.lengthOfLongestSubstring(s));

	}
}
