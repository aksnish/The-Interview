package DataStructures;

import java.util.HashMap;
import java.util.Hashtable;


public class HashMapHashtableExample {

	public static void main(String[] args) { 

		Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
		hashtableobj.put("Alive is ", "awesome");
		hashtableobj.put("Love", "yourself");
		System.out.println("Hashtable object output :"+ hashtableobj);

		HashMap<String,String> hashmapobj = new HashMap<String,String>();
		hashmapobj.put("Alive is ", "awesome");  
		hashmapobj.put("Love", "yourself"); 
		System.out.println("HashMap object output :"+hashmapobj);   

	}
}