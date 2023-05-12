package com.leetcode.java.programs.easy;

import java.util.ArrayList;
import java.util.List;

public class ListInsideList {

	public static void main(String[] args) {
		

		List<List<Integer>> merge = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<>();

		merge.add(list1);

		System.out.println(merge);

		
		
		for (int i = 0; i <5; i++) {

			List<Integer> inside = new ArrayList<>();
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					System.out.print("1" + " ");
					inside.add(j,1);
				
				} else {
//					
					System.out.print(i-1+" ");
					
					inside.add(j,i-1);

				}
			
			}
			list1=inside;
			merge.add(list1);
			

			System.out.println();
		}



		System.out.print(merge);

	}

}
