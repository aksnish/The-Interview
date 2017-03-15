package Sorting;

import java.io.*;
import java.util.*;

public class HackerBubble {

	public static void main(String[] args) {
		int temp = 0;
		int numberOfSwaps=0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = scan.nextInt();
		}
		for(int j = 0; j < n - 1; j++){
			for(int k = 1; k < n - j; k++){
				if(array[k-1] > array[k]){
					temp = array[k - 1];
					array[k - 1] = array[k];
					array[k] = temp;
					numberOfSwaps++;
				}
			}

		}
		System.out.println("Array is sorted in "+ numberOfSwaps + " swaps.");
		System.out.println("First Element: "+ array[0]);
		System.out.println("Last Element: "+ array[array.length - 1]);
	}	
}
