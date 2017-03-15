package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MakeAnagrams {

	public static void main(String args []) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		//System.out.println(numberNeeded(a, b));
		System.out.println(anagram(a, b));
	}

	public static boolean anagram(String a, String b){
		return (sort(a)).equals(sort(b));
	}

	private static String sort(String a) {
		// TODO Auto-generated method stub
		char [] sorte = a.toCharArray();
		Arrays.sort(sorte);
		String str = new String(sorte); 
		return str;
	}
}
