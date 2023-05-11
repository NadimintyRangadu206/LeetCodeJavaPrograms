package com.leetcode.java.programs.easy;

/**
 * 
 * @author nadim
 * 
 *         Given a string s consisting of words and spaces, return the length of
 *         the last word in the string.
 * 
 *         A word is a maximal substring consisting of non-space characters
 *         only.
 * 
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: s = "Hello World" 
 *         Output: 5
 *         
 *          Explanation: The last word is
 *         "World" with length 5. 
 *         
 *         
 *         Example 2:
 * 
 *         Input: s = " fly me to the moon "
 *          Output: 4
 *           
 *         Explanation: The last
 *         word is "moon" with length 4.
 *         
 *          Example 3:
 * 
 *         Input: s = "luffy is still joyboy" 
 *         Output: 6 
 *         Explanation: The last
 *         word is "joyboy" with length 6.
 *
 */

public class LengthOfLastWord58 {

	public int lengthOfLastWord(String s) {

		String[] arr = s.split(" ");

		int length = arr.length;

		String s1 = new String();
		
		for (int i = 0; i < arr.length; i++) {

			if (i == (length - 1)) {
				s1 = arr[i];
			}
		}

		int count = s1.length();

		return count;
	}

	public static void main(String[] args) {

		LengthOfLastWord58 lolw = new LengthOfLastWord58();

		String s = "Hello World";

		System.out.println(lolw.lengthOfLastWord(s));

	}

}
