package com.leetcode.java.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringToIntConversion {

	public int myAtoi(String s) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') && (s.charAt(i) != ' ') || (s.charAt(i) == '-')
					&& (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) && (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) {
				sb.append(s.charAt(i));
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int no= Integer.valueOf(sb.toString());

		int no = Integer.parseInt(sb.toString());

		return no;
	}

	public static void main(String[] args) {

		StringToIntConversion sti = new StringToIntConversion();

		String str = "words and 987";

		System.out.println(sti.myAtoi(str));
	}
}
