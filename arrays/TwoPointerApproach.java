package com.arrays;

import java.util.Arrays;

// It works only in the sorted array
public class TwoPointerApproach {
	public static void findingTwoSum(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int sum = 0;
		Arrays.sort(arr);//1,2,3,4,5,6,7
		while(start < end) {
			sum = arr[start]+arr[end]; //1, 2, 4, 3, 6, 5, 7
			if(sum == target) {
				System.out.println(start);
				System.out.println(end);
				return;
			} else if(sum < target) {
				start = start + 1;
			} else {
				end = end - 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3,2,4 };
		int target = 6;
		findingTwoSum(arr, target);
		// This approach yields O(n) time complexity where n indicates n number of iterations
		// O(1) space complexity as we are using constant space, no extra space we are using
	}
}
