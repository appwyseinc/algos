package dynamicprogramming.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 
https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].


 */

public class LetterCombinationOfAPhoneNumber {
	
	public static final Map<String, char[]> digitsMap = new HashMap<>();

    static {
    	digitsMap.put("2", new char[] {'a', 'b', 'c'});
    	digitsMap.put("3", new char[] {'d', 'e', 'f'});
    	digitsMap.put("4", new char[] {'g', 'h', 'i'});
    	digitsMap.put("5", new char[] {'j', 'k', 'l'});
    	digitsMap.put("6", new char[] {'m', 'n', 'o'});
    	digitsMap.put("7", new char[] {'p', 'q', 'r', 's'});
    	digitsMap.put("8", new char[] {'t', 'u', 'v'});
    	digitsMap.put("9", new char[] {'w', 'x', 'y', 'z'});
    }
	
	
    public void letterCombination(String phoneNumber) {
    	
    	char[] phoneArr = phoneNumber.toCharArray();
    	List<String> availableCombinations = new ArrayList<String>();
    	backTrack(0, phoneArr, availableCombinations, new StringBuffer());
    	for(String s : availableCombinations) {
    		System.out.print(s + ", ");
    	}
    }
    
    private void backTrack(int currentIndex, char[] phoneArr, List<String> availableCombinations, StringBuffer sb) {
    	String number = String.valueOf(phoneArr[currentIndex]);
    	char[] letterArr = digitsMap.get(number);
    	for(int i=0; i<letterArr.length; i++) {
    		sb.append(letterArr[i]);
    		if(currentIndex < (phoneArr.length - 1)) {
    			backTrack(currentIndex + 1, phoneArr, availableCombinations, sb);
    		} else {
    			if(currentIndex == (phoneArr.length - 1))
    			availableCombinations.add(sb.toString());
    			sb.deleteCharAt(sb.length()-1);
    		}
    	}
    	if(sb.length() >= 1) {
    		sb.deleteCharAt(sb.length()-1);
    	}
    }
    
    public static void main(String[] args) {
    	LetterCombinationOfAPhoneNumber lcopn = new LetterCombinationOfAPhoneNumber();
    	lcopn.letterCombination("7979");
    }
	

}
