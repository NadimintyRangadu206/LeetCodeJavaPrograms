package com.leetcode.java.programs;

public class ReverseNo {

	public int reverse(int x) {

		int remainder = 0;
		long reverseNo = 0;

		while (x > 0 || x < 0) {

			remainder = x % 10;
			reverseNo = (reverseNo * 10) + remainder;
			x = x / 10;
		}
		
		if(reverseNo>Integer.MAX_VALUE || reverseNo<Integer.MIN_VALUE) {
			return 0;
		}

		return (int)reverseNo;
	}

	public static void main(String[] args) {

		ReverseNo rn = new ReverseNo();
		int x = 1534236469;

		System.out.println(rn.reverse(x));
	}
}
