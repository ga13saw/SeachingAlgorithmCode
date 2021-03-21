package com.code4you.binaryseach.countOccured;

public class Solution {

	public static void main(String[] args) {
		// int[] nums = {3,6,20,20,20,33,55,66};
		int[] nums = { 3, 6, 12, 20, 20, 20, 20, 66 };

		int searchNum2 = countOccurance(nums, 20);
		System.out.println(searchNum2);

	}

	private static int countOccurance(int[] nums, int i) {
		int first = firstOccurence(nums, i, 0, nums.length - 1);
		int last = lastOccurence(nums, i, 0, nums.length - 1);
		if (first == -1) {
			return 0;
		} else {
			return last - first + 1;
		}
	}

	private static int firstOccurence(int[] nums, int i, int j, int k) {

		while (j <= k) {
			int mid = (j + k) / 2;

			if (nums[mid] > i) {
				k = mid - 1;
			} else if (nums[mid] < i) {
				j = mid + 1;
			} else {
				if (mid == 0 || nums[mid - 1] != nums[mid]) {
					return mid;
				} else {
					k = mid - 1;
				}

			}

		}

		return -1;
	}

	private static int lastOccurence(int[] nums, int i, int j, int k) {

		while (j <= k) {
			int mid = (j + k) / 2;

			if (nums[mid] > i) {
				k = mid - 1;
			} else if (nums[mid] < i) {
				j = mid + 1;
			} else {
				if (mid == k || nums[mid + 1] != nums[mid]) {
					return mid;
				} else {
					j = mid + 1;
				}

			}

		}

		return -1;
	}

}
