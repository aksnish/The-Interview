package Sorting;

import java.util.Arrays;

public class Quicksort {
	public static void main(String[] args) {
		int array[] = {9,2,6,4,3,5,1, 1};
		quicksort(array);
	}
	
	public static void quicksort(int [] array){
		quicksort(array, 0, array.length - 1);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	private static void quicksort(int [] array, int left, int right){
		if(left >= right){
			return;
		}
		int pivot = array[(left + right)/2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		int i = 0;
		while(left <= right){
			while(array[left] < pivot){
				left++;
			}
			while(array[right] > pivot){
				right--;
			}
			if(left <= right){
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
	}
}
