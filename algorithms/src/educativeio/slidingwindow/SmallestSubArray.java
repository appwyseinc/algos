package educativeio.slidingwindow;

/*

Problem Statement #
Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.

Example 1:

Input: [2, 1, 5, 2, 3, 2], S=7 
Output: 2
Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
Example 2:

Input: [2, 1, 5, 2, 8], S=7 
Output: 1
Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
Example 3:

Input: [3, 4, 1, 1, 6], S=8 
Output: 3
Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] or [1, 1, 6].

               c
2, 1, 5, 2, 3, 2
         s
*/
public class SmallestSubArray {
	
	public int smallestSubArray(int[] arr, int S) {

	    int length = Integer.MAX_VALUE;
	    int start = 0;
	    int sum = 0;
	    for(int i=0; i<arr.length; i++) {
	      sum += arr[i];
	      while(sum >= S) {
		    length = Math.min(length, (i-start)+1);
	        sum -= arr[start];
	        start++;
	      }
	    }
	    if(length == Integer.MAX_VALUE) 
	      return 0;
	    return length;
	  }
	
	public static void main(String[] args) {
		SmallestSubArray ssa = new SmallestSubArray();
		
		int length = ssa.smallestSubArray(new int[] {2, 1, 5, 2, 3, 2}, 7);
		System.out.println("Smallest sub Array Size is : "+length);
		
		length = ssa.smallestSubArray(new int[] {2, 1, 5, 2, 8}, 7);
		System.out.println("Smallest sub Array Size is : "+length);
		
		
		length = ssa.smallestSubArray(new int[] {3, 4, 1, 1, 6}, 8);
		System.out.println("Smallest sub Array Size is : "+length);
	}

}
