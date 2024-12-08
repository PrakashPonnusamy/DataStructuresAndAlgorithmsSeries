package com.recursion;

public class Factorial {
	
	public static int findFact(int n) {//5*4*3*2*1
		int result = 0;
		if(n<=1) {// base case
			return 1;
		} else {
			result = n * findFact(n-1); 
		}
		
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		int result = findFact(n);
		System.out.println(result);
	}
}
