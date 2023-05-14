package com.leetcode.java.programs.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author nadim
 * 
 *         Given a non-empty array of integers nums, every element appears twice
 *         except for one. Find that single one.
 * 
 *         You must implement a solution with a linear runtime complexity and
 *         use only constant extra space.
 *
 */

public class SingleNumber {
	
	/**
	 * 
	 * @param nums
	 * @return
	 * 
	 *         Example 1:
	 * 
	 *         Input: nums = [2,2,1] 
	 *         
	 *         Output: 1 
	 *         
	 *         Example 2:
	 * 
	 *         Input: nums = [4,1,2,1,2] 
	 *         
	 *         Output: 4 
	 *         
	 *         Example 3:
	 * 
	 *         Input: nums = [1] 
	 *         
	 *         Output: 1
	 */

	public int singleNumber(int[] nums) {

		int k[] = new int[nums.length];

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			k[i] = 1;
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					k[i]++;
					nums[j] = 0;
				}
			}
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < k.length; i++) {

			if (nums[i] != 0) {
				System.out.println(nums[i] + "-" + k[i]);
				map.put(nums[i], k[i]);
			}
		}

		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		int p = 0;
		while (itr.hasNext()) {

			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

			if (entry.getValue() == 1) {
				p = entry.getKey();
			}

		}

		return p;
	}

	public static void main(String[] args) {

		SingleNumber sn = new SingleNumber();

		int[] nums = { 2, 2, 1 };
		System.out.println(sn.singleNumber(nums));

	}

}
