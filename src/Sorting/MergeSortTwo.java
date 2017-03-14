package Sorting;

import java.util.Arrays;

public class MergeSortTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 9, 5, 12, 11, 2, 4, 15, 20, 25};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int lowerIndex, int upperIndex) {
		if (lowerIndex >= upperIndex) return;
		else {
			int midIndex = (lowerIndex + upperIndex)/2;
			mergeSort(arr, lowerIndex, midIndex);
			mergeSort(arr, midIndex+1, upperIndex);
			merge(arr, lowerIndex, midIndex, upperIndex);
		}
	}

	public static void merge(int[] arr, int lowerIndex, int midIndex, int upperIndex) {
		// TODO Auto-generated method stub
		int tempArr[] = new int[arr.length];
		for (int i=lowerIndex; i<=upperIndex; i++) {
			tempArr[i] = arr[i];
		}
		int i = lowerIndex;
		int j = midIndex+1;
		int k = lowerIndex;
		while (i<=midIndex && j <=upperIndex) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			}
			else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		// Any leftovers in the lower array
		while (i<=midIndex) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
		// Any leftovers in upper array - NOT required as whole array is already copied
		while (j<=upperIndex) {
			arr[k] = tempArr[j];
			k++;
			j++;
		}
	}
}