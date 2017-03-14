package CTCI;

public class UniqueString {

	public static void main(String[] args) {

		String input = "Hel xyz";
		//System.out.println(method4(input));
		//System.out.println(isUnique(input));
		//reverseString(input);
		removeDuplicates(input.toCharArray());
	}


	public static boolean method4(String input)
	{		
		boolean result = false;
		for(char ch : input.toCharArray()){
			if(input.indexOf(ch) == input.lastIndexOf(ch))
				result =  true;
			else{
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean isUnique(String str){
		boolean[] char_set = new boolean[256]; 
		for (int i = 0; i < str.length(); i++) { 
			int val = str.charAt(i); 
			if (char_set[val]) return false; 
			char_set[val] = true; 
		}
		return true;
	}

	//Reverse a string
	public static void reverseString(String str){
		StringBuilder strbld = new StringBuilder();
		for(int i = str.length()-1; i >= 0 ; i--){
			strbld.append(str.charAt(i));
		}

		System.out.println(strbld);
	}


	public static void removeDuplicates(char[] str) { 
		if (str == null) return; 
		
		int len = str.length; 
		
		if (len < 2) return; 
		
		int tail = 1; 
		for (int i = 1; i <= len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) { 
				if (str[i] == str[j]) break; 
			} 
			
			if (j == tail) { 
				str[tail] = str[i]; 
				++tail; 
			} 
		} 
		str[tail] = 0; 
	}
}
