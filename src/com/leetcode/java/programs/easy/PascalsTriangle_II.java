package com.leetcode.java.programs.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the
 * Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * @author nadim
 *
 */

public class PascalsTriangle_II {
	
	/**
	 * 
	 * Example 1:
	 * 
	 * Input: rowIndex = 3 Output: [1,3,3,1]
	 * 
	 *  Example 2:
	 * 
	 * Input: rowIndex = 0 Output: [1] 
	 * 
	 * Example 3:
	 *
	 * Input: rowIndex = 1 Output: [1,1]
	 * 
	 * @param rowIndex
	 * @return
	 */

	public List<Integer> getRow(int rowIndex) {

		List<List<Integer>> lli = new ArrayList<List<Integer>>();

		List<Integer> outSide = new ArrayList<>();
		int numsrows = 100;
		for (int i = 0; i < numsrows; i++) {
			List<Integer> inSide = new ArrayList<>();
			for (int j = 0; j <= i; j++) {

				if (i == j || j == 0) {
					inSide.add(j, 1);
				} else {
					inSide.add(j, outSide.get(j) + outSide.get(j - 1));
				}
			}
			outSide = inSide;

			lli.add(outSide);
		}

		List<Integer> t = new ArrayList<>();
		for (int i = 0; i < lli.size(); i++) {

			if (i == rowIndex) {
				t = lli.get(i);
			}
		}
		return t;
	}

	public static void main(String[] args) {

		PascalsTriangle_II pt = new PascalsTriangle_II();

		int rowIndex = 4;
		
		System.out.println(pt.getRow(rowIndex));

	}

}
