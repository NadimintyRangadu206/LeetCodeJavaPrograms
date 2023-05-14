package com.leetcode.java.programs.easy;

/**
 * 
 * @author nadim
 *
 *         A phrase is a palindrome if, after converting all uppercase letters
 *         into lowercase letters and removing all non-alphanumeric characters,
 *         it reads the same forward and backward. Alphanumeric characters
 *         include letters and numbers.
 * 
 *         Given a string s, return true if it is a palindrome, or false
 *         otherwise.
 *         
 */
public class ValidPalindrome {

	/**
	 * 
	 * @param s
	 * @return
	 * 
	 *         Example 1:
	 * 
	 *         Input: s = "A man, a plan, a canal: Panama" 
	 *         Output: true 
	 *         
	 *         Explanation:
	 *                       "amanaplanacanalpanama" is a palindrome. 
	 *         
	 *         Example 2:
	 * 
	 *         Input: s = "race a car"
	 *         Output: false 
	 *         
	 *         Explanation: "raceacar" is not
	 *         a palindrome. 
	 *         
	 *         Example 3:
	 * 
	 *         Input: s = " " Output: true 
	 *         
	 *         Explanation:
	 *         
	 *          s is an empty string ""
	 *         after removing non-alphanumeric characters. Since an empty string
	 *         reads the same forward and backward, it is a palindrome.
	 */
	public boolean isPalindrome(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					|| (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

				sb.append(s.charAt(i));
			}
		}
		String s1 = sb.toString();
		s1 = s1.toLowerCase();
		StringBuilder sb1 = new StringBuilder();

		for (int i = s1.length() - 1; i >= 0; i--) {

			sb1.append(s1.charAt(i));
		}

		String s2 = sb1.toString();

		s2 = s2.toLowerCase();
		boolean b = false;

		if (s1.equalsIgnoreCase(s2)) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {

		ValidPalindrome vp =new ValidPalindrome();
		
		String s="A man, a plan, a canal: Panama";
		
		System.out.println(vp.isPalindrome(s));
	}

}
