package com.sandeep.algos.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement #
Given a string, find the length of the longest substring in it with no more than K distinct characters.

Example 1:

Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".
Example 2:

Input: String="araaci", K=1
Output: 2
Explanation: The longest substring with no more than '1' distinct characters is "aa".
Example 3:

Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".


 * @author saradada
 *
 */

public class LongestSubstringKDistinct {
	
	public static int longestSubstringKDistinct(String principal, int distinctCharacters) {
		
		char[] principlaChars = principal.toCharArray();
		int longestSubStringLength = Integer.MIN_VALUE;
		int subStringLength = 0;
		int iteration = 1;
		Map<Character, Integer> uniqueChars = new HashMap<>();
		for(int i=0; i<principlaChars.length; i++) {
			subStringLength++;
			if(uniqueChars.containsKey(principlaChars[i])) {
				int count = uniqueChars.get(principlaChars[i]) + 1;
				uniqueChars.put(principlaChars[i], count);
			} else {
				uniqueChars.put(principlaChars[i], 1);
			}
			if(uniqueChars.size() > distinctCharacters) {
				longestSubStringLength = Math.max(longestSubStringLength, subStringLength-1);
				Character charToRemove = principlaChars[iteration-1];
				subStringLength = i-iteration;
				iteration++;
				
				if(uniqueChars.containsKey(charToRemove) && uniqueChars.get(charToRemove) <= 1) {
					System.out.println(charToRemove);
					uniqueChars.remove(charToRemove);
				}
			}
		}
		
		return longestSubStringLength;
	}
	
	public static void main(String[] args) {
		//System.out.println(LongestSubstringKDistinct.longestSubstringKDistinct("araaci", 2));
		//System.out.println(LongestSubstringKDistinct.longestSubstringKDistinct("araaci", 1));
		//System.out.println(LongestSubstringKDistinct.longestSubstringKDistinct("cbbebi", 3));
		System.out.println(LongestSubstringKDistinct.longestSubstringKDistinct("saradada", 2));
	}

}
