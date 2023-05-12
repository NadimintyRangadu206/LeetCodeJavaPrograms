package com.leetcode.java.programs.easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author nadim
 * 
 *         You are given two integer arrays nums1 and nums2, sorted in
 *         non-decreasing order, and two integers m and n, representing the
 *         number of elements in nums1 and nums2 respectively.
 * 
 *         Merge nums1 and nums2 into a single array sorted in non-decreasing
 *         order.
 * 
 *         The final sorted array should not be returned by the function, but
 *         instead be stored inside the array nums1. To accommodate this, nums1
 *         has a length of m + n, where the first m elements denote the elements
 *         that should be merged, and the last n elements are set to 0 and
 *         should be ignored. nums2 has a length of n.
 *
 */
public class MergeSortedArray {

	/**
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 * 
	 * 
	 *              Example 1:
	 * 
	 *              Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	 *              Output: [1,2,2,3,5,6] 
	 *              
	 *              Explanation: 
	 *              
	 *              The arrays we are merging are
	 *              [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6]
	 *              with the underlined elements coming from nums1. 
	 *              
	 *              Example 2:
	 * 
	 *              Input: nums1 = [1], m = 1, nums2 = [], n = 0 
	 *           
	 *              Output: [1]
	 *             
	 *              Explanation:
	 *              
	 *              The arrays we are merging are [1] and []. The
	 *              result of the merge is [1].
	 *              
	 *               Example 3:
	 * 
	 *              Input: nums1 = [0], m = 0, nums2 = [1], n = 1
	 *              Output: [1]
	 *             
	 *              Explanation: 
	 *              
	 *              The arrays we are merging are [] and [1]. The
	 *              result of the merge is [1]. Note that because m = 0, there are
	 *              no elements in nums1. The 0 is only there to ensure the merge
	 *              result can fit in nums1.
	 * 
	 */
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {

			if (nums1[i] != 0) {
				list.add(nums1[i]);
			}
		}

		for (int i = 0; i < nums2.length; i++) {

			list.add(nums2[i]);
		}

		Collections.sort(list);

		int nums[] = new int[m + n];

		for (int i = 0; i < list.size(); i++) {

			nums[i] = list.get(i);
		}
		
		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			list1.add(nums[i]);
		}

		Collections.sort(list1);

		for (int i = 0; i < list1.size(); i++) {
			nums1[i] = list1.get(i);
		}

	}

	public static void main(String[] args) {

		MergeSortedArray msa = new MergeSortedArray();

		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };

		int m = 3;
		int n = 3;

		msa.merge(nums1, m, nums2, n);

	}

}
