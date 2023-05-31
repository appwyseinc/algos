package com.sandeep.algos.sliding;

import java.util.Arrays;

public class InplaceSwap {
	
	
	public static void main(String[] args) {
		int[] sortedArray = {1,2};
		
		/**
		 * 
		 * 1. Get i
		 * 2. if i+1 == i, then reserver the index of that spot in j
		 * 3. if i+1 > i, then move i+1 into j amd swap j into current index , next spot of j = j+1;
		 * 
		 */
		int swapSpot = 1;
		for(int i=1; i<sortedArray.length; i++) {
			if(sortedArray[i] > sortedArray[i-1]) {
				if(swapSpot < i && sortedArray[i] > sortedArray[swapSpot]) {
					sortedArray[swapSpot] = sortedArray[i];
					
				}
				swapSpot = swapSpot+1;
				
			} 
		}
		System.out.println(swapSpot);
		Arrays.stream(sortedArray).forEach(System.out::println);
	}

}
