package local.code.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestArray {
	public static void main(String[] args) {
		LongestArray la = new LongestArray();
		int [] a = {4,3,1,2,1,4};
		int k =3;
//		LongestArray.maxLength(a, k);

		 	List<String> top5Books = new ArrayList<String>();
		    top5Books.add("Clean Code");
		    top5Books.add("Clean Coder");
		    top5Books.add("Effective Java");
		    top5Books.add("Head First Java");
		    top5Books.add("Head First Design patterns");
		    
		    top5Books.set(k, "asdfasfgfg");
		    
		    System.out.println(top5Books);
		    
	}
	 static int maxLength(int[] a, int k) {
	        int sum = 0;
	        int longest = 0;
	        int max =0;
	        int a1[] = new int[k];
	        
	        for(int i=1; i<a.length;i++){
	            if(sum <= k && a[i]<=k){
	                sum += a[i];
	                longest ++;
	                a1[i] = a[i];
	            }
	        }
	        for(int x : a1){
	        	System.out.println("ele: "+x);
	        }
	        
	        if(max < longest){
	           max = longest;
	        }
	        System.out.println(max);
	        return max;
	    }
	 

}

