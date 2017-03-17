package HacerRank;

import java.util.Scanner;

public class TestPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char [] vowels = {'a', 'e', 'i', 'o', 'u'};
		char [] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		char [] test4 = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z', 'a', 'e', 'i', 'o', 'u'};
		buildStrings(test4, n, vowels, consonants);
	}

	public static void buildStrings(char[] root, int length, char [] v, char [] c)
	{
	    // allocate an int array to hold the counts:
	    int[] pos = new int[length];
	    // allocate a char array to hold the current combination:
	    char[] combo = new char[length];
	    // initialize to the first value:
	    for(int i = 0; i < length; i++)
	        combo[i] = root[0];

	    while(true)
	    {
	        // output the current combination:
	    		
	    		System.out.println(String.valueOf(combo));

	        // move on to the next combination:
	        int place = length - 1;
	        while(place >= 0)
	        {
	            if(++pos[place] == root.length)
	            {
	                // overflow, reset to zero
	                pos[place] = 0;
	                combo[place] = root[0];
	                place--; // and carry across to the next value
	            }
	            else
	            {
	                // no overflow, just set the char value and we're done
	                combo[place] = root[pos[place]];
	                break;
	            }
	        }
	        if(place < 0)
	            break;  // overflowed the last position, no more combinations
	    }
	}
	
}
