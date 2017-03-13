package local.code.hacker;

import java.util.*;

public class CandyReplenisher {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] c = new int[t];
		for(int c_i=0; c_i < t; c_i++){
			c[c_i] = in.nextInt();
		}
		int count = 0;
		int m = n;
		//while(t > 0){
		for(int i = 0; i < c.length; i++){
			if(i < t -1){
				System.out.println("t: " + t);
				if(n >= c[i]){
					n = n - c[i];
					System.out.println("first n: "+n);
					if(n < 5){
						count +=  m - n;
						n += (m - n);
						System.out.println("second n: "+n);
						System.out.println("count: "+ n);
						//					t--;
					}
					else{
						//					t--;
						continue;
					}
				}
				else{
					n = n+1;
					count = count+1;
					n = n - c[i];
					System.out.println("first n: "+n);
					if(n < 5){
						count +=  m - n;
						n += (m - n);
						System.out.println("second n: "+n);
						System.out.println("count: "+ n);
						//					t--;
					}
					else{
						//					t--;
						continue;
					}
				}
			}
			else{
				break;
			}
		}
		System.out.println("why: "+ count);
	}
}
