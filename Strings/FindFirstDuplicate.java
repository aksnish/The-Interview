package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstDuplicate {
	public static char getFirstNonRepeatedChar(String str) { 
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		for (char c : str.toCharArray()) { 
			counts.put(Character.toLowerCase(c), counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		} 
		for (Entry<Character,Integer> entry : counts.entrySet()) { 
			if (entry.getValue() == 1) { return entry.getKey(); 
			} 
		} 
		throw new RuntimeException("didn't find any non repeated Character"); 
	}

	public static void main(String[] args) {
		
//		System.out.println(getFirstNonRepeatedChar("Hellohowareyuo"));
		
		String str = "Hellohowareyuo";
		Map<Character, Integer> dupMap = new LinkedHashMap<Character, Integer>();
		for(char s : str.toCharArray()){
			if(!dupMap.containsKey(s)){
				dupMap.put(Character.toLowerCase(s), 1);
			}
			else{
				dupMap.put(Character.toLowerCase(s), dupMap.get(s)+1);
			}
		}
		for(Entry<Character, Integer> e: dupMap.entrySet()){
			if(e.getValue() == 1){
				System.out.println(e.getKey());
				break;
			}
		}
	}
}