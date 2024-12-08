package com.arrays;

public class ClosestPairInTwoArrays {
	void printClosest(int ar1[], int ar2[], int x)
    {

        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
        int l = 0, r = ar2.length-1;
        while (l<ar1.length && r>=0)
        {
           if (Math.abs(ar1[l] + ar2[r] - x) < diff)
           {
               res_l = l;
               res_r = r;
               diff = Math.abs(ar1[l] + ar2[r] - x);
           }
           if (ar1[l] + ar2[r] > x)
               r--;
           else  
               l++;
        }
        System.out.print("The closest pair is [" + ar1[res_l] +
                         ", " + ar2[res_r] + "]");
    }
 
    // Driver program to test above functions
    public static void main(String args[])
    {
    	ClosestPairInTwoArrays ob = new ClosestPairInTwoArrays();
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 27, 40};
        int x = 38;
        ob.printClosest(ar1, ar2, x);
    }
}
