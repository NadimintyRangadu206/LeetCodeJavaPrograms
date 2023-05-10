package com.leetcode.java.programs;

import java.util.HashMap;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		HashMap<Integer, String> map = new HashMap<>();

		for (String s : strs) {
			int i = 1;
			map.put(i, s);
			i++;
		}
		
		
		
		
		return null;

	}

	public static void main(String[] args) {

		LongestCommonPrefix lcp = new LongestCommonPrefix();

		String strs[] = { "flower", "flow", "flight" };

		lcp.longestCommonPrefix(strs);
	}

}
