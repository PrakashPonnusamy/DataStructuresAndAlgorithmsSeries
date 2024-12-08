package com.Searching;

public class BinarySearchCustomCode {
	public static int findElement(int[] arr, int target) {
		if(arr.length < 1) {
			return -1;
		}
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = left +(right - left)/2;
			if(arr[mid]==target) {
				return mid;
			} 
			
			if(arr[mid] < target) {
				left =  mid + 1;
			} else  {
				right = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int target = 5;
		int result = findElement(arr, target);
		System.out.println(result);
	}
}
