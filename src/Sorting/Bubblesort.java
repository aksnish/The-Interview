package Sorting;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int array[] = {3,2,1};
		bubblesort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	private static int[] bubblesort(int[] array) {
		int temp = 0;
		int num =0;
		for(int i = 0; i< array.length - 1; i++){
			for(int j = 1; j < array.length - i; j++){
				if(array[j - 1] > array[j]){
					temp = array[j -1];
					array[j - 1] = array[j];
					array[j] = temp;
					num++;
				}
			}
			System.out.println("Iteration "+(i+1)+":"+Arrays.toString(array));
			
		}
		System.out.println(num);
		 return array;
	}
}
