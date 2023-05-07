package com.leetcode.java.programs;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {

	public boolean isMatch(String s, String p) {

		Pattern pattern = Pattern.compile(p);

		Matcher m = pattern.matcher(s);

		boolean b = false;
		if (m.matches()) {
			b = true;
		}

		/*
		 * StringTokenizer st= new StringTokenizer(s,p); // this second way Of Approach
		 * 
		 * 
		 * boolean b= false;
		 * 
		 * if(st.hasMoreElements()) { b=true; }
		 */

		return b;

	}

	public static void main(String[] args) {
		RegularExpressionMatching rem = new RegularExpressionMatching();

		String s = "aa";
		String p = "a";
		System.out.println(rem.isMatch(s, p));

//		 1.Test Case: s="aa" ,p="a"  o/p=false;

//		 2.TestCase: s="aa" ,p="a*" o/p=true;

//		 3.TestCase : s="ab" ,p=".*" o/p=true

	}
}
