package CTCI;

import java.util.*;

public class MakeAnagrams {
	public static int numberNeeded(String first, String second) {
		int [] counts = new int[26];
		char a = 'a';
		char [] charArray = first.toCharArray();

		for(int i = 0; i< charArray.length; i++){
			counts[charArray[i] - a]++;
		}
		charArray = second.toCharArray();
		for(int j = 0; j < charArray.length; j++){
			counts[charArray[j] - a ]--;
		}
		int sum = 0;
		for(int i = 0; i < counts.length; i ++){
			sum += Math.abs(counts[i]);
		}

		return sum;      
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
	
	HashMap<String, Integer> map;
}
