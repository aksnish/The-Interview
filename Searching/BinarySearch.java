package Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int [] array = {1,2,3,15,48,20,31,50};
		int n = 15;
//		binarySearch(array, n);
		System.out.println(binarySearchIterative(array, n));
	}

	private static void binarySearch(int[] array, int searchNum) {
		int low = 0;
		int high = array.length - 1;
		System.out.println(binarySearchRecursive(array, searchNum, low, high));
	}

	private static boolean binarySearchRecursive(int[] array, int searchNum, int low, int high) {
		if(low > high){
			return false;
		}
		int mid = low +((high - low)/ 2);
		if(array[mid] == searchNum){
			System.out.println("Element at: "+ (mid + 1));
			return true;
		}
		else if (searchNum < array[mid]){
			return binarySearchRecursive(array, searchNum, low, mid - 1);
		}
		else{
			return binarySearchRecursive(array, searchNum, mid + 1, high);
		}
	}
	private static boolean binarySearchIterative(int[] array, int searchNum) {
		int low  = 0;
		int high = array.length -1;
		while(low <= high){
			int mid = low+high/2;
			if(array[mid] == searchNum){
				System.out.println("Element at: "+ (mid + 1));
				return true;
			}
			else if (searchNum < array[mid]){
				high = mid -1;
			}
			else{
				low = mid + 1;
			}
		}
		return false;
	}
}
