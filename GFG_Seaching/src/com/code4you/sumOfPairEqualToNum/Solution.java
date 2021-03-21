package com.code4you.sumOfPairEqualToNum;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int[] numArr = { 10, 20, 30, 40, 50,100, 500};
		// int findNum = 500;
		int sum = 40;
		boolean seachNum = isPairPresent(numArr, sum);
		boolean isPresent = isPairPresentUsingSet(numArr, sum);
		boolean result = isPairPresentInSortedarr(numArr, sum);
		System.out.println(seachNum + " " + isPresent+" "+result);
	}

	private static boolean isPairPresentInSortedarr(int[] numArr, int sum) {

		int start = 0;
		int end = numArr.length-1;
		while (start<end) {
			if (numArr[start]+numArr[end]==sum) {
				return true;
			}else if (numArr[start]+numArr[end]>sum) {
				end--;
			}else{
				start++;
			}
			
		}
		return false;
	}

	// better for unsorted array
	private static boolean isPairPresentUsingSet(int[] numArr, int sum) {
		Set<Integer> num = new HashSet<>();

		for (int i = 0; i < numArr.length; i++) {
			if (!num.contains(sum - numArr[i])) {
				num.add(numArr[i]);
			} else {
				return true;
			}
		}

		return false;
	}

	// better for unsorted array
	private static boolean isPairPresent(int[] numArr, int sum) {
		for (int i = 0; i < numArr.length; i++) {
			int otherNumOfSum = sum - numArr[i];
			int binarySearch = binarySearch(numArr, otherNumOfSum, i + 1, numArr.length - 1);
			if (binarySearch != -1) {
				return true;
			}
		}
		return false;
	}

	private static int binarySearch(int[] numArr, int sum, int i, int index) {

		while (i <= index) {
			int mid = (i + index) / 2;
			if (numArr[mid] == sum) {
				return mid;
			} else if (numArr[mid] < sum) {
				i = mid + 1;
			} else {
				index = mid - 1;
			}
		}
		return -1;
	}
	
	//for sorted array 2 pointer approach

}
