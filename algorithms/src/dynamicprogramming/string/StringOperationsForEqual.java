package dynamicprogramming.string;


/**
 * 
 * @author saradada
 * 
 * Pseudo code
 * 
 * firstString = "saturday"
 * secondString = "sunday"
 * 
 * 
 * yadn
 * 
 * firstString = "cookie"
 * secondString = "cookies"
 * 
 * 
 * if string are equal then it doesn't matter
 * 
 * initiate a new array of size larger string
 * 
 * initialize another array that is of size bigger string and insert ### in the empty indexes.
 * 
 * 
 * 
 * for i=0 i<firstString.length i++
 * 		for j=0; j<secondString.length j++
 * 
 * 
 * if character at the same index matches, then move the next one
 * if not then see if the next character from one array matches the current character, 
 * 	if so then see how many characters matches if so, then add the missing character to the end and move all the indexes
 * 
 * 
 *
 */
public class StringOperationsForEqual {
	
	
	public void matchString(String string1, String string2) {
		char[] firstStringArr = string1.toCharArray();
		char[] secondStringArr = string2.toCharArray();
		
		char[] newStringArr = new char[(firstStringArr.length >= secondStringArr.length) ? firstStringArr.length : secondStringArr.length];
		
		
		
	}

}
