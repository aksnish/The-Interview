package local.code.sorting;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int array[] = {9,2,6,4,3,5,1};
		bubblesort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	private static int[] bubblesort(int[] array) {
		int temp = 0;
		for(int i = 0; i< array.length - 1; i++){
			for(int j = 1; j < array.length - i; j++){
				if(array[j - 1] > array[j]){
					temp = array[j -1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(array));
		}
		 return array;
	}
}
