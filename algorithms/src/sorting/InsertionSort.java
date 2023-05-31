package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public void sort(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			int currentIndex = i;
			while(currentIndex > 0 && array[currentIndex] < array[currentIndex-1]) {
				int temp = array[currentIndex-1];
				array[currentIndex-1] = array[currentIndex];
				array[currentIndex] = temp;
				currentIndex = currentIndex-1;
			}
		}
	}
	
	public static void main(String[] args) {
		int array[] = {7,3,2,5,6,10,9,8,1};
		System.out.println(Arrays.toString(array));
		InsertionSort x = new InsertionSort();
		x.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
