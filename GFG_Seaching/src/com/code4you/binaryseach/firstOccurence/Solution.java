package com.code4you.binaryseach.firstOccurence;

public class Solution {

	public static void main(String[] args) {
		//int[] nums = {3,6,20,20,20,33,55,66};
		int[] nums = {3,6,12,18,20,20,20,66};
		int searchNum = firstOccurenceRecursive(nums,20,0,nums.length-1);
		int searchNum2 = firstOccurence(nums,20,0,nums.length-1);
		System.out.println(searchNum+" "+searchNum2);
		
	}

	private static int firstOccurence(int[] nums, int i, int j, int k) {
		
		while(j<=k){
			int mid = (j+k)/2;
			
			if(nums[mid]>i){
				k=mid-1;
			}
			else if(nums[mid]<i){
				j=mid+1;
			}else{
				if(mid==0 || nums[mid-1]!=nums[mid]){
					return mid;
				}else{
					k=mid-1;
				}
			
			}
			
		}
		
		return -1;
	}

	private static int firstOccurenceRecursive(int[] nums, int data,int start,int end) {
		if(start>end){
			return -1;
		}
		
		int mid = (start+end)/2;
		
		if (data<nums[mid] && start<end) {
			 return firstOccurenceRecursive(nums,data,0,mid-1);
		}
		else if (data>nums[mid] && start<end ) {
			 return firstOccurenceRecursive(nums, data, mid+1, end);
		}
		else{
			if (mid==0 || nums[mid]!=nums[mid-1]) {
				return mid;
			}
			else{
				return firstOccurenceRecursive(nums, data, start, mid-1);
				}
			
		}
		
		
		
		
	}
	
	

}
