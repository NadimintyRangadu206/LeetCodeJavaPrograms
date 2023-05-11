package com.leetcode.java.programs.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 
 * @author nadim
 * 
 *         Given a sorted array of distinct integers and a target value, return
 *         the index if the target is found. If not, return the index where it
 *         would be if it were inserted in order.
 * 
 *         You must write an algorithm with O(log n) runtime complexity.
 *         
 *         
 *
 */
public class SearchInsertPosition35 {

	public int searchInsert(int[] nums, int target) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(target);
		
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				return i;
			} else {

				list.add(nums[i]);

			}
		}
		
		int n = 0;
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == target) {
				n = i;
			}
		}
		return n;
	}

	public static void main(String[] args) {

		SearchInsertPosition35 sip = new SearchInsertPosition35();

		int nums[] = { 1, 3, 5, 6 };
		int target = 5;

		System.out.println(sip.searchInsert(nums, target));
		
//  		                   Testcase: 1
/*
		              Input: nums = [1,3,5,6], target = 5
				      Output: 2
*/
		
//				               Testcase: 2
				
				
/*			        Input: nums = [1,3,5,6], target = 2
			      	Output: 1
			      	
*/			
//				             Testcase: 3
				
/*			       Input: nums = [1,3,5,6], target = 7
				   Output: 4
*/			
	}
}
