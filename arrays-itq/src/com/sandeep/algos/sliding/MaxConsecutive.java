package com.sandeep.algos.sliding;

public class MaxConsecutive {
	
	public static void main(String[] args) {
		int[] binaryArray = {1,1,1,0,0,1,1,1,1,0,1,1,0,1,1,1,0};
		
		//int[] binaryArray = {0,1};
		
		int maxConsequtiveNum = 1;//Making sure if the array all has zeros, then swap atleast 1 and result should be 1
		int counter = 0;
		boolean swapHit = false;
		for(int i=0; i<binaryArray.length; i++) {
		
			if(binaryArray[i] == 1) {
				counter++;
			} 
			
			if(binaryArray[i] == 0 && !swapHit) {
				counter++;
				swapHit = true;
				
			} 
			
			else {
				if(maxConsequtiveNum < counter) {
					maxConsequtiveNum = counter;
				}
				counter = 0;
				swapHit = false;
			}
			
		}
		
		if(maxConsequtiveNum < counter) {
			maxConsequtiveNum = counter;
		}
		
		System.out.println(maxConsequtiveNum);
		
	}

}
