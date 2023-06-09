package com.leetcode.java.programs.easy;

/**
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * @author nadim
 *
 */
public class SquareRoot {

	/**
	 * 
	 * @param x
	 * @return
	 * 
	 * 
	 *         Example 1:
	 * 
	 *         Input: x = 4 Output: 2
	 *         
	 *         Explanation: The square root of 4 is 2, so we
	 *         return 2. Example 2:
	 * 
	 *         Input: x = 8 Output: 2 
	 *         
	 *         sExplanation: The square root of 8 is
	 *         2.82842..., and since we round it down to the nearest integer, 2 is
	 *         returned.
	 */
	
	public int mySqrt(int x) {

		int n = (int) Math.sqrt(x);

		return n;
	}
	
	public static void main(String[] args) {
		
		SquareRoot sr= new SquareRoot();
		
		int x=2;
		
		System.out.println(sr.mySqrt(x));

	}

}
