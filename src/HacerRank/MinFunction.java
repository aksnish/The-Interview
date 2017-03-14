package HacerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinFunction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(createMin(n));
	}

	private static String createMin(int n) {
		String b = "";
		String finalStr = "";
		if(n >= 2 && n <= 50){
			if(n == 2){
				finalStr = "min(int, int)";
			}
			else{
				b = createMin(n - 1);
				finalStr = "min(int, "+ b +")"; 
			}
		}
		else{
			System.out.println("Please check value of n");
		}
		return finalStr;
	}
}