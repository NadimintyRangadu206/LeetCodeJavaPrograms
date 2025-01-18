package com.leetcode.java.programs.medium;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {

	public static void main(String[] args) {
		
//		Scanner scanner= new Scanner(System.in);
//	     
//	     while(scanner.hasNext()){
//	         String s=scanner.nextLine();
//	     Pattern p=Pattern.compile("^[a-z0-9A-Z]{1}[A-Za-z0-9_]{7,29}");
//	     
//	     Matcher m= p.matcher(s);
//	     
//	     if(m.find()){
//	         System.out.println("Valid");
//	     }else{
//	         System.out.println("InValid");
//	     }
//	     }
	     
		byte arr[]= {2,3,5,7,11,13};
	     
	     BigInteger bi= new BigInteger(arr);
	     
	     if(bi.isProbablePrime(1)) {
	    	 System.out.println("Prime");
	     }else {
	    	 System.out.println("not Prime");
	     }
	}

}
