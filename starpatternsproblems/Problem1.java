package com.starpatternsproblems;

public class Problem1 {
	public static void printpatterns1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col = 1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printpatterns2(int n) {
		for(int row=1;row<=n;row++) {
			for(int col = 1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printpatterns3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col = 1;col<=n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printpatterns4(int n) {
		for(int row = 1;row<=n;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	int n = 5;
	printpatterns4(n);
}
}
