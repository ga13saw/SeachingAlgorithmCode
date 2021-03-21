package com.code4you.peakElement;

public class Solution {
	
	public static void main(String[] args) {
		//int[] numArr= {100,500,10,20,30,40,50};
		//int[] numArr= {100,500,10,20,30,40,15};
		//int[] numArr= {10,7,8,20,12};
		//int[] numArr= {5,10,20,15,7};
		//int[] numArr= {10,20,15,5,23,90,67};
		int[] numArr= {80,70,90};
		int seachNum = seachPeakNum(numArr);
		System.out.println(" peak element is "+numArr[seachNum]);
	}

	private static int seachPeakNum(int[] numArr) {

		int start = 0;
		int end = numArr.length-1;
		while (start<=end) {
			int mid = (start+end)/2;
			if ((mid==0 || numArr[mid-1]<numArr[mid] )&&( mid==end || numArr[mid+1]<numArr[mid])) {
				return mid;
			}
			if(mid>0 && numArr[mid-1]>numArr[mid]){
				end=mid-1;
			}else{
				start=mid+1;
			}
			
		}
		return -1;
	}

	}
