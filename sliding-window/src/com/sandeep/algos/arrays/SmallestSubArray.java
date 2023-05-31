package com.sandeep.algos.arrays;

/**
 * 
 * 
 * Problem Statement: Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
 * Example 1: Input: [2, 1, 5, 2, 3, 2], S=7 
			  Output: 2
			  Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
	
   Example 2: Input: [2, 1, 5, 2, 8], S=7 
			  Output: 1
			  Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
			  
   Example 3: Input: [3, 4, 1, 1, 6], S=8 
			  Output: 3
			  Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] or [1, 1, 6].
 * 
 * @author saradada
 *
 */

public class SmallestSubArray {
	
	public static int smallestSubArray(int[] array, int sum) {
		
		int subArrayLength = 0;
		int windowSum = 0;
		int subArrayEndIndex = 0;
		int tempLength = 0;
		for(int i=0; i<array.length; i++) {
			tempLength++;
			windowSum +=  array[i];
			if(windowSum >= sum ) {
				if(subArrayEndIndex == 0) {
					return 1;
				}
				subArrayLength = (subArrayLength == 0) ? Math.max(subArrayLength, tempLength) : Math.min(subArrayLength, tempLength);
				windowSum = windowSum - array[i-subArrayEndIndex];
				tempLength = subArrayEndIndex - 1;
				subArrayEndIndex = i - subArrayEndIndex;
			}
			subArrayEndIndex++;
		}
		
		return subArrayLength;
	}
	
	public static void main(String[] args) {
		System.out.println("Example 1: " + SmallestSubArray.smallestSubArray(new int[] {2, 1, 5, 2, 3, 2}, 7));
		System.out.println("Example 2: " + SmallestSubArray.smallestSubArray(new int[] {2, 1, 5, 2, 8}, 7));
		System.out.println("Example 3: " + SmallestSubArray.smallestSubArray(new int[] {3, 4, 1, 1, 6}, 8));
		System.out.println("Example 4: " + SmallestSubArray.smallestSubArray(new int[] {3, 4, 1, 1, 6}, 3));
		System.out.println("Example 5: " + SmallestSubArray.smallestSubArray(new int[] {3, 4, 1, 1, 6}, 80));
	}

}
