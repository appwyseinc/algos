package com.sandeep.algos.arrays;

/*
 * 
 * 
 * Problem Statement: Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 * Example 1: Input: [2, 1, 5, 1, 3, 2], k=3 
			  Output: 9
			 Explanation: Subarray with maximum sum is [5, 1, 3].
	
   Example 2: Input: [2, 3, 4, 1, 5], k=2 
			  Output: 7
			  Explanation: Subarray with maximum sum is [3, 4].
 * 
 * 
 */
public class ContiguousSum {
	
	
	public static int contiguousSum(int[] array, int subArraySize) {
		
		int arraySum = 0;
		int maxSum = 0;
		int resultArrayIndex = 0;
		int arrayBreakIndex = 0;
		for(int i=0; i<array.length; i++) {
			arraySum = arraySum + array[i];
			
			if(arrayBreakIndex == subArraySize-1) {
				if(arraySum > maxSum) {
					maxSum = arraySum;
				}
				arraySum = arraySum - array[i-subArraySize + 1];
				resultArrayIndex++;
				arrayBreakIndex = i - resultArrayIndex;
				
			}
			arrayBreakIndex++;
			
		}
		return maxSum;
	}
	
	public static void main(String args[]) {
		int maxSum = ContiguousSum.contiguousSum(new int[]{1, 2, 4, 6, 8, 9, 7, 4 , 6, 9}, 4);
		System.out.println(maxSum);
	}

}
