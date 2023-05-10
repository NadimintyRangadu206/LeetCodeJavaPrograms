package com.leetcode.java.programs;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {

		char ch[] = s.toCharArray();

		Stack<Character> sc = new Stack<>();

		for (char c : ch) {

			switch (c) {
			case '(':
			case '{':
			case '[':
				sc.push(c);
				break;
			case ')':
				if (sc.isEmpty() || sc.pop() != '(') {
					return false;
				}
				break;
			case '}':
				if (sc.isEmpty() || sc.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if (sc.isEmpty() || sc.pop() != '[') {
					return false;
				}

				break;

			}
		}

		return sc.empty();

	}

	public static void main(String[] args) {
		ValidParentheses cp = new ValidParentheses();

		String s = "([])";
		System.out.println(cp.isValid(s));
	}
}
