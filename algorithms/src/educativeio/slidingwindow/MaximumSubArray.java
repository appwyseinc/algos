package educativeio.slidingwindow;
/*

Problem Statement #
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].
Example 2:

Input: [2, 3, 4, 1, 5], k=2 
Output: 7
Explanation: Subarray with maximum sum is [3, 4].


    
2 1 5 1 3 2

*/
public class MaximumSubArray {
	
	public int maxSubArray(int[] arr, int k) {

	    int sum = Integer.MIN_VALUE;
	    if(arr.length < k) {
	      return 0;
	    }
	    int start = 0;
	    int tempSum = 0;
	    for(int i=0; i<arr.length; i++) {
	      tempSum += arr[i];
	      if(i >= k-1) {
	        sum = Math.max(sum, tempSum);
	        tempSum -= arr[start];
	        start++;
	      } 
	    }

	    return sum;
	  }
	
	
	public static void main(String args[]) {
		MaximumSubArray msa = new MaximumSubArray();
		int sum = msa.maxSubArray(new int[] {2, 1, 5, 1, 3, 2}, 3);
		System.out.println("sum: "+sum);
		
		sum = msa.maxSubArray(new int[] {2, 3, 4, 1, 5}, 2);
		System.out.println("sum: "+sum);
	}

}
