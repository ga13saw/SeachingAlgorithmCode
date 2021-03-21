package com.code4you.searchInrotatedSortedArray;

public class Solution {
	
	public static void main(String[] args) {
		int[] numArr= {100,500,10,20,30,40,50};
		//int findNum = 500;
		int findNum = 40;
		int seachNum = seachNum(numArr,findNum);
		System.out.println(" index of "+findNum+" is: "+seachNum);
	}

	private static int seachNum(int[] numArr, int findNum) {

		int start = 0;
		int end = numArr.length-1;
		while (end>=start) {
			int mid = (start+end)/2;
			if (numArr[mid]==findNum) {
				return mid;
			}
			if (numArr[mid]>numArr[start]) {
				if (findNum>=numArr[start] && findNum<numArr[mid-1]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}else {
				if (findNum>numArr[mid] && findNum<numArr[end]) {
					start=mid+1;
					
				}else {
					end=mid-1;
				}
			}
			
		}
		
		return -1;
	}
}
