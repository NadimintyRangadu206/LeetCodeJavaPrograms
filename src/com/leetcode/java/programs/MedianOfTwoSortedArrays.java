package com.leetcode.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author nadim
 * 
 * 
If the given number of observations/data is odd, then the formula to calculate the median is:

Median = {(n+1)/2}th term---->odd



If the given number of observations is even, then the formula to find the median is given by:

Median = [(n/2)th term + {(n/2)+1}th term]/2---->Even
 *
 */

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {

			list.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}

		Collections.sort(list);

		int no = list.size();

		int n = list.size() / 2;

		// double medainValue = 0;

		if (no % 2 == 0) {
			

			return (list.get(no - 1) + list.get(no)) / 2.00;

/*		medain=	[(n/2)th term + (n/2 + 1)th term]/2 ---> even

			return medainValue = ((no / 2) + ((no / 2) + 1)) / 2.00; */

		}

	 /* else {

			  Median = [(n + 1)/2]th term --->Odd
		          	return medainValue = (no + 1) / 2.00;
		}*/

		return list.get(n);

	}

	public static void main(String[] args) {

		MedianOfTwoSortedArrays mtsa = new MedianOfTwoSortedArrays();

		int nums1[] = {};

		Arrays.sort(nums1);

		int nums2[] = { 1 };

		Arrays.sort(nums2);

		System.out.println(mtsa.findMedianSortedArrays(nums1, nums2));
		
		
		
		               // Test Case1:
		
		/*
		        Input: nums1 = [1,3], nums2 = [2]
				Output: 2.00000
				Explanation: merged array = [1,2,3] and median is 2.
				
		*/		
				                     //Test2:
				
				/*
				       Input: nums1 = [1,2], nums2 = [3,4]
						Output: 2.50000
						Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
						
						*/
	}
}
