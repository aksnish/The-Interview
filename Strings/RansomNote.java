package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for(int magazine_i=0; magazine_i < m; magazine_i++){
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for(int ransom_i=0; ransom_i < n; ransom_i++){
			ransom[ransom_i] = in.next();
		}
		Map<String, Integer> magHash = new HashMap<String, Integer>();
		for(String s: magazine){
			if(!magHash.containsKey(s)){
				magHash.put(s, 1);
			}
			else{
				magHash.put(s, magHash.get(s)+1);
			}
		}

		boolean res = true;
		for(String word: ransom){
			if(!magHash.containsKey(word)){
				res = false;
			}
			else if(magHash.get(word) == 0){
				res = false;
			}
			else{
				magHash.put(word, magHash.get(word) - 1);
			}
		}

		System.out.println(res ? "Yes" : "No");
	}
}
