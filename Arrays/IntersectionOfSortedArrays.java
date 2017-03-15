package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfSortedArrays {
	public static void main(String[] args) {
		int arrA [] = {1, 2, 4, 5, 6, 7, 325, 8, 31};
		int arrB [] = {2, 3, 325, 5, 7, 31};
		int m = arrA.length;
		int n = arrB.length;
		findCommonSortedDistinct(arrA, arrB, m, n);
		findcommonHash(arrA, arrB);
	}

	private static void findcommonHash(int[] arrA, int[] arrB) {
		Set<Integer> testB = new HashSet<Integer>();
		for(int j = 0; j < arrB.length; j++){
			testB.add(arrB[j]);
		}
		for(int j = 0; j < arrA.length; j ++){
			if(testB.contains(arrA[j])){
				System.out.println(arrA[j]);
			}
		}
	}

	private static void findCommonSortedDistinct(int[] arrA, int[] arrB, int m, int n) {
		int i = 0, j =0;
		while(i < m && j < n){
			if(arrA[i] < arrB[j]){
				i ++;
			}
			else if(arrA[i] > arrB[j]){
				j++;
			}
			else{
				System.out.println(arrB[j]);
				j++;
			}
		}
	}
	
	
}
