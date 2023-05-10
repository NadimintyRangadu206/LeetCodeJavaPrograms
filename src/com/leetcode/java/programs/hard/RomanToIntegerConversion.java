package com.leetcode.java.programs.hard;

/**
 * 
 * @author nadim
 * 
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 * 
 * 
 *    O/P
 *  Case 1=III;-->3;
		
	Case 2:=LVIII-->58
				
	Case 3=	MCMXCIV-->1994	
 *
 */
public class RomanToIntegerConversion {

	public int romanToInt(String s) {

		int value = 0;
		
		if (s.contains("CM")) {
			s = s.replace("CM", "DCCCC");
		}
		if (s.contains("CD")) {
			s = s.replace("CD", "CCCC");
		}
		if (s.contains("XC")) {
			s = s.replace("XC", "LXXXX");
		}
		if (s.contains("XL")) {
			s = s.replace("XL", "XXXX");
		}
		if (s.contains("IX")) {
			s = s.replace("IX", "VIIII");
		}
		if (s.contains("IV")) {
			s = s.replace("IV", "IIII");
		}

		System.out.println(s);

//		map.put("IV", 4);
//		map.put("IX", 9);
//		map.put("XL", 40);
//		map.put("XC", 90);
//		map.put("CD", 400);
//		map.put("CM", 900);

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			String str = String.valueOf(ch);

			switch (str) {
			case "I":
				value += 1;
				break;

			case "V":
				value += 5;
				break;

			case "X":
				value += 10;
				break;

			case "L":
				value += 50;
				break;

			case "C":
				value += 100;
				break;

			case "D":
				value += 500;
				break;

			case "M":
				value += 1000;
				break;
			default:
				value = -1;
				break;
			}

		}

		return value;
	}

	public static void main(String[] args) {

		String s = "MCMXCIV";
		RomanToIntegerConversion ric = new RomanToIntegerConversion();
		System.out.println(ric.romanToInt(s));

	}
}
