package HacerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PolesApart {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		HashMap<Integer, Integer> tes = new HashMap<>();
		int w_array [] = new int[n];
		int x_array [] = new int[n];
		for(int a0 = 0; a0 < n; a0++){
			int x_i = in.nextInt();
			int w_i = in.nextInt();
			tes.put(x_i, w_i);
			w_array[a0] = w_i;
			x_array[a0] = x_i;
		}

		int cost = 0;
		for(int i = 0; i< n; i++){
			for(int j =0; j< n; j++){
				if(x_array[i] > x_array[j]){
					cost = w_array[i] * (x_array[i] - x_array[j]);
				}
			}
		}

	}

}