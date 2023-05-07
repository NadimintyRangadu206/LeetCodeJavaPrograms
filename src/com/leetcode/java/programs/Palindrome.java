package com.leetcode.java.programs;

public class Palindrome {

	public boolean isPalindrome(int x) {

		int reverse = 0;
		boolean b = false;
		int r = 0;
		int temp = x;

		while (x > 0) {
			r = x % 10;
			reverse = (reverse * 10) + r;
			x = x / 10;

		}

		if (temp == reverse) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		
		int x = 121;

		System.out.println(p.isPalindrome(x));
		
//		1.Test Case:121 o/p=true;
//		2	.Test Case:-121 o/p=false;
//			3	.Test Case:10 o/P=false;
	}

}
