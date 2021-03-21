package com.code4you.median;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = { 10, 20, 30, 40, 50 };
		int[] numArr2 = { 5, 15, 25, 35, 45 }; // arr1.length<= arr2.length
		
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {10,20,30,40,50};
		
		int[] b1 = {30,40,50,60};
		int[] b2 = {5,6,7,8,9};
		
		//double meadian = calculateMeadian(numArr1, numArr2);
		double meadian = calculateMeadian(numArr1, numArr2);
		System.out.println("Meadin is: " + meadian);
	}

	private static double calculateMeadian(int[] numArr1, int[] numArr2) {
		int arr1Len = numArr1.length;
		int arr2Len = numArr2.length;
		
		
		int start=0,end=arr1Len;
		while (start<=end) {
			int i1 = (start+end)/2;
			int i2 = (arr1Len+arr2Len+1)/2-i1;
			int min1= (i1==arr1Len)?Integer.MAX_VALUE:numArr1[i1];
			int max1=	(i1==0)?Integer.MIN_VALUE:numArr1[i1-1];		
			int min2=(i2==arr2Len)?Integer.MAX_VALUE:numArr2[i2];
			int max2=	(i2==0)?Integer.MIN_VALUE:numArr2[i2-1];	
			
			if (max1<=min2 && max2<=min1) {
				if ((arr1Len+arr2Len)%2==0) {
					return (double)(Math.max(max1, max2)+Math.min(min1, min2))/2;
				}else {
					return (double)Math.max(max1, max2);
				}
			}else if (max1>min2) {
				end=i1-1;
			}else {
				start=i1+1;
			}
			
		}
		return -1;
		
	}
}
