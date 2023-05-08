package com.leetcode.java.programs;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author nadim
 * 
 * 
 *         DESCRIPTION:
 * 
 *         Given an array of integers nums and an integer target, return indices
 *         of the two numbers such that they add up to target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         You can return the answer in any order.
 *
 * 
 * 
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					arr.add(i);
					arr.add(j);
				}
			}
		}

		int a[] = new int[arr.size()];
		
		int i = 0;
		
		for (int j : arr) {
			a[i] = j;
			i++;
		}

		return a;
	}
	
	public static void main(String[] args) {
		
		TwoSum ts= new TwoSum();
		
		int nums[]= {2,7,11,15};
		
		 int  target=9;
		 
		System.out.println(ts.twoSum(nums, target));
		
		/**
		 * Test Case 1:
		 * 
		 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
		 * nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
		 * 
		 * TestCase 2:
		 * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
		 * 
		 * TestCase3:
		 * Input: nums = [3,3], target = 6 Output: [0,1]
		 */
	}
}
