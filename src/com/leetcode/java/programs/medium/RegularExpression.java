package com.leetcode.java.programs.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	
	public boolean regex(String s) {
		
		
		Pattern p= Pattern.compile("[a-zA-Z0-9]{3}");
		
		Matcher m=p.matcher(s);
		
		boolean b= false;
		if(m.find()) {
			
			b= true;
		}else {
			b=false;
		}
		return b;
		}
	public static void main(String[] args) {
	
		RegularExpression re= new RegularExpression();
		
		String s="000.12.12.034";
		
	System.out.println(re.regex(s));
/*		000.12.12.034
		121.234.12.12
		23.45.12.56
		00.12.123.123123.123
		122.23
		Hello.IP
		
*/		

	}

}
