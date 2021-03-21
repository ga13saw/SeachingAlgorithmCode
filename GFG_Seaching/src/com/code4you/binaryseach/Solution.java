package com.code4you.binaryseach;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {3,6,12,20,29,33,55,66};
		int searchNum = searchNum(nums,56,0,nums.length-1);
		int searchNum2 = searchNum2(nums,66,0,nums.length-1);
		System.out.println(searchNum+" "+ searchNum2);
		
	}

	private static int searchNum2(int[] nums, int i, int j, int k) {
		
		while(j<=k){
			int mid = (j+k)/2;
			if(nums[mid]==i){
				return mid;
			}
			else if(nums[mid]>i){
				k=mid-1;
			}
			else{
				j=mid+1;
			}
			
		}
		
		return -1;
	}

	private static int searchNum(int[] nums, int data,int start,int end) {
		
		int mid = (start+end)/2;
		
		if (nums[mid]==data) {
			return mid;
		}
		if (data<nums[mid] && start<end) {
			 return searchNum(nums,data,0,mid-1);
		}
		if (data>nums[mid] && start<end ) {
			 return searchNum(nums, data, mid+1, end);
		}
		
		return -1;
		
	}
	
	

}
