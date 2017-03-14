package Sorting;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		//int [] array = {2,8,9,7,6,12,3,5,4,10,11,1};
		int [] array = {2,8,9,7,6};
		mergesort(array);
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	public static void mergesort(int[] array){
		mergesort(array, new int[array.length], 0, array.length-1);

	}

	private static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
		if(leftStart >= rightEnd){
			return;
		}
		int middle = (leftStart + rightEnd)/2;
		mergesort(array, temp, leftStart, middle);
		mergesort(array, temp, middle + 1, rightEnd);
		mergeHalves(array, temp, leftStart, rightEnd );
	}

	private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd + 1;
		//size of entire array
		int sizeofArray = rightEnd - leftStart + 1;

		//left index to walk to right half
		int left = leftStart;

		//right index to walk to right half
		int right = rightStart;

		//index for the temp array to write elements to this temp array, starting @ leftStart
		int index = leftStart;

		//this is walking through each half of the element and copying the small element
		while(left <= leftEnd && right <= rightEnd){
			if(array[left] <= array[right]){
				temp[index] = array[left];
				left++;
			}
			else{
				temp[index] = array[right];
				right++;
			}
			index++;
		}

		//once one of the indexes goes out of bounds, copy over the rest of the elements in either half

		System.arraycopy(array, left, temp, index, leftEnd - left +1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(array, leftStart, temp, leftStart, sizeofArray);
	}
}
