package Sorting;

public class BubbleSort {

	public static void bubbleSort(int [] array){
		boolean isSorted = false;
		int lastUnsorted = array.length -1;
		while(!isSorted){
			isSorted = true;
			for(int i = 0; i < array.length - 1; i++){
				if(array[i] > array[i+1]){
					swap(array, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsorted --;
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String args [] ){
		int [] arra = {6,7,3,2,1,4};
		bubbleSort(arra);

	}
}
