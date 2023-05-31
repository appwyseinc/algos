package sorting;

import java.util.Arrays;

/**
 * 
 * @author Sandeep Aradada
 * 
 * Pseudo Code
 * 
 * 
 *
 */

public class BubbleSort {
	
	public int[] sort(int[] array, int size) {
		
		boolean swapped = false; //flag that helps to see if the array is already sorted
		//looping through the array size
		for(int i=0; i<size-1; i++) {
			swapped = false;
			for(int j=0; j<size - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		return array;
	}
	
	
	public void sort2(int[] array) {
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for(int j=0; j<array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] testArray = new int[] {8,9,6,0,1,2,3,4,8,6,5,0};
		BubbleSort bubbleSort = new BubbleSort();
		int[] swappedArray = bubbleSort.sort(testArray, testArray.length);
		
		System.out.println("Test Sort 2"+Arrays.toString(swappedArray));
		
		int[] testArray2 = new int[] {9,8,7,6,5,4,3,2,1};
		bubbleSort.sort2(testArray2);
		System.out.println("Test Sort 2"+Arrays.toString(testArray2));
	}

}
