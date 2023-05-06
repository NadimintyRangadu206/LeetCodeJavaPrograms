package com.leetcode.java.programs;


/**
 * 
 * @author nadim
 * 
 * 
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

 *
 */
public class IntegerToRomanConversion {

	public String intToRoman(int num) {

		String arr[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {

			while (num >= values[i]) {
				num -= values[i];
				sb.append(arr[i]);
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		IntegerToRomanConversion itr = new IntegerToRomanConversion();

		System.out.println(itr.intToRoman(58));
		
		// Test Case 1: 3-->III
		//Test Case 2:  58-->LVIII
		//Test Case 3:   1994-->MCMXCIV
	}
}
