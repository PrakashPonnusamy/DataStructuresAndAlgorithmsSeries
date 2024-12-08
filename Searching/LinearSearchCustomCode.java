package com.Searching;

public class LinearSearchCustomCode {

	public static int searchElement(int[] arr, int target) {
		int index = -1;
		if (arr.length < 1) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index = i;
			}
		}
		if (index != -1) {
			return index;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 6, 4, 8, 5 };
		int target = 8;
		int target1 = 10;
		int result = searchElement(arr, target);
		int result1 = searchElement(arr, target1);
		if (result != -1) {
			System.out.println("Out target element : " + target + " present at this index : " + result);
		} else {
			System.out.println("Our target element : " + target + " not found in the array");
		}
		if (result1 != -1) {
			System.out.println("Out target element : " + target1 + " present at this index : " + result1);
		} else {
			System.out.println("Our target element : " + target1 + " not found in the array");
		}
	}
}
