package Random;

public class KLargestElementsInArray {

	public static void main(String[] args) {
		int [] array ={1,85,96,32,54};
		kLargest2(array, 2);
	}

	public static void kLargest2(int[] array, int k){

		int minIndex = 0, i;                            //Find Min

		for (i = k; i < array.length; i++){
			minIndex = 0;
			for (int j = 0; j < k; j++){
				if(array[j] < array[minIndex]){
					minIndex = j;
					array[minIndex] = array[j];
				}
			}       
			if (array[minIndex] < array[i]){         //Swap item if min < array[i]

				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
		for (int q = 0; q < k; q++){                            //Print output
			System.out.print(array[q] + " ");
		}
	} 
}
