package com.leetcode.java.programs.hard;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	 public List<List<Integer>> threeSum(int[] nums) {
	                                                                                  
	        List<Integer> list= new ArrayList<>();
	        
	         int k=2; int j=1;
	         
	        for(int i=0 ;i<nums.length;i++,j++,k++){
	            
	        	if(i!=j&& j!=k&& i!=k) {
	        		if(nums[i]+nums[j]+nums[k]==0) {
	        			list.add(nums[i]);
	        			list.add(nums[j]);
	        			list.add(nums[k]);
	        		}
                    	        		
	        	}
	        }
	        System.out.println(list);
			return null;
	        
	        
	    }
	
	public static void main(String[] args) {
		
		ThreeSum ts=new ThreeSum();
		
		int nums[]= {-1,0,1,2,-1,-4};
		System.out.println(ts.threeSum(nums));
	}
}
