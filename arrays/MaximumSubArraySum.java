package com.arrays;
// Sliding window approach
public class MaximumSubArraySum {

	public static int findMaximumSubArraySum(int[] arr, int k){
		int maxSum = 0;
		int windowSum = 0;
		for(int i=0;i<k;i++) {
			windowSum = windowSum + arr[i];
		}
		maxSum = windowSum;
		for(int i = k;i<arr.length;i++) {//1,1,5,2,4,6
			windowSum = windowSum + arr[i] - arr[i-k];
			
			maxSum = Math.max(windowSum, maxSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,5,2, 4, 6};
		int k = 2;
		int result = findMaximumSubArraySum(arr, k);
		System.out.println("Maximum Sub Array Sum is : "+result);
		
	}
}
