package com.code4you.squareroot;

public class Solution {

	public static void main(String[] args) {

		int num = 96;
		
		int findSquareroot = findSquareroot(num);
		int findSqrOpt = findSqrOpt(num);
		System.out.println("Square of "+ num+" is:"+findSquareroot+" "+findSqrOpt);

	}
	
	//TC: O(root of num)
	private static int findSquareroot(int num) {
		
		for (int i = 2; i*i <= num; i++) {
			int sqr = i*i;
			int sqrNext = (i+1)*(i+1);
			if(sqr <= num && num<sqrNext){
				return i;
				
			}
		}
		return 1;
	}
	
	private static int findSqrOpt(int num) {
		int low=0, high=num, ans =-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			int sqr = mid * mid;
			if(sqr==num){
				return mid;
			}
			else if(sqr>num){
				high = mid-1;
			}
			else{
				low = mid+1;
				ans=mid;
			}
		}
		return ans;
	}
	

}
