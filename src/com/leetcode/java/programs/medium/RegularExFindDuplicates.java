package com.leetcode.java.programs.medium;

import java.util.Scanner;

public class RegularExFindDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			String s = sc.nextLine();

			String arr[] = s.split(" ");
			int fre[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				fre[i] = 1;
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i].equals(arr[j])) {
						fre[i]++;
						arr[j] = "0";
					}
				}

			}

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != "0" && arr[i] != " ") {
					sb.append(arr[i]);
				}
			}
			System.out.println(sb.toString());

		}

	}

}
