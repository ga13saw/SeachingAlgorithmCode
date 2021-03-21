package com.code4you.majority_element;

public class Solution {

	public static void main(String[] args) {

		//int[] numArr = {2,3,1,2,9,2,2,2,2};
		int[] numArr = {2,3,1,2,9,1,1};
		int majorityElement = findMajorityElement(numArr);
		if (majorityElement!=-1) {
			System.out.println("Majority element is: "+majorityElement);
		}else{
			System.out.println("No majority element found");
		}
	}

	private static int findMajorityElement(int[] numArr) {
		int count=1,res=0;
		for (int i = 0; i < numArr.length-1; i++) {
			if (numArr[i]==numArr[i+1]) {
				count++;
			}else {
				count--;
			}
			if (count==0) {
				count=1;
				res=numArr[i+1];
			}
		}
		count=0;
		for (int i = 0; i < numArr.length; i++) {
			if (res==numArr[i]) {
				count++;
			}
		}
		if (count>numArr.length/2) {
			return res;
		}
		
		return -1;
	}

}
