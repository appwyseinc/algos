package sorting;

import java.util.Arrays;

/**
 * 
 * @author saradada
 *
 */
public class SelectionSort {
	
	
	public void sort(int[] array) {
		int[] tempArray = array;
		int swapIndex = 0;
		for(int i=0; i<tempArray.length; i++) {
			swapIndex = i;
			for(int j=i+1; j<tempArray.length; j++) {
				if(tempArray[j] < tempArray[swapIndex]) {
					swapIndex = j;
				}
			}
			int temp = tempArray[i];
			tempArray[i] = tempArray[swapIndex];
			tempArray[swapIndex] = temp;
		}
		//return array;
 	}
	
	
	
	public static void main(String[] args) {
		int array[] = {1,3,2,5,6,4,7,4,8,4,9};
		System.out.println(Arrays.toString(array));
		SelectionSort x = new SelectionSort();
		x.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}




