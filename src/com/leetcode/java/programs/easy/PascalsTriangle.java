package com.leetcode.java.programs.easy;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author nadim
 * 
 *         iven an integer numRows, return the first numRows of Pascal's
 *         triangle.
 * 
 *         In Pascal's triangle, each number is the sum of the two numbers
 *         directly above it as shown:
 *         
 *                 1
 *                1 1
 *               1 2 1
 *              1 3 3 1
 *             1 4 6 4 1  
 *                
 *                
 */              

public class PascalsTriangle {

	/**
	 * 
	 * @param numRows
	 * @return
	 * 
	 *         Example 1:
	 * 
	 *         Input: numRows = 5
	 *         
	 *         Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
	 *          
	 *         Example 2:
	 * 
	 *         Input: numRows = 1 
	 *         
	 *         Output: [[1]]
	 */
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> e = new ArrayList<List<Integer>>();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> inside = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					inside.add(j, 1);
				} else {
					inside.add(j, list.get(j) + list.get(j - 1));
				}
			}
			list = inside;
			e.add(list);
		}

		return e;
	}

	public static void main(String[] args) {

		int numrows = 5;

		PascalsTriangle pt = new PascalsTriangle();

		System.out.println(pt.generate(numrows));

	}

}
